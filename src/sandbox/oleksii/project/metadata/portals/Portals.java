package sandbox.oleksii.project.metadata.portals;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 21.08.2018.
 */
public class Portals extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".portal";

    public Portals(String rootPath) {
        super(rootPath + "/portals");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new PortalMetadata(fileName));
            }
        }
    }

    @Override
    public List<PortalMetadata> getMetadata() {
        return (List<PortalMetadata>) super.getMetadata();
    }
}

package sandbox.oleksii.project.metadata.staticResources;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
public class StaticResources extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".resource";

    public StaticResources(String rootPath) {
        super(rootPath + "/staticresources");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new StaticResourceMetadata(fileName));
            }
        }
    }

    @Override
    public List<StaticResourceMetadata> getMetadata() {
        return (List<StaticResourceMetadata>) super.getMetadata();
    }
}

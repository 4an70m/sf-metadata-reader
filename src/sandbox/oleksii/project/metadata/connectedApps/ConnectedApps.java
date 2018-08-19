package sandbox.oleksii.project.metadata.connectedApps;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class ConnectedApps extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".connectedApp";

    public ConnectedApps(String rootPath) {
        super(rootPath + "/connectedApps");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ConnectedAppMetadata(fileName));
            }
        }
    }

    @Override
    public List<ConnectedAppMetadata> getMetadata() {
        return (List<ConnectedAppMetadata>) super.getMetadata();
    }
}

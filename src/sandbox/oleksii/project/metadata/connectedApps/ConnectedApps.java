package sandbox.oleksii.project.metadata.connectedApps;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class ConnectedApps extends Folder {

    public static final String CLASS_EXTENSION = ".connectedApp";

    public ConnectedApps(String rootPath) {
        super(rootPath + "/connectedApps");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ConnectedAppsMetadata(fileName));
            }
        }
    }

    @Override
    public List<ConnectedAppsMetadata> getMetadata() {
        return (List<ConnectedAppsMetadata>) super.getMetadata();
    }
}

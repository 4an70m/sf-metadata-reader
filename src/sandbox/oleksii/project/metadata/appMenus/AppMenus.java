package sandbox.oleksii.project.metadata.appMenus;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class AppMenus extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".appMenu";

    public AppMenus(String rootPath) {
        super(rootPath + "/appMenus");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new AppMenuMetadata(fileName));
            }
        }
    }

    @Override
    public List<AppMenuMetadata> getMetadata() {
        return (List<AppMenuMetadata>) super.getMetadata();
    }
}

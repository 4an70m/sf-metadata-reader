package sandbox.oleksii.project.metadata.tabs;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Tabs extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".tab";

    public Tabs(String rootPath) {
        super(rootPath + "/tabs");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new TabMetadata(fileName));
            }
        }
    }

    @Override
    public List<TabMetadata> getMetadata() {
        return (List<TabMetadata>) super.getMetadata();
    }
}

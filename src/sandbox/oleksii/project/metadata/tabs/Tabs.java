package sandbox.oleksii.project.metadata.tabs;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Tabs extends Folder {

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
                this.metadata.add(new TabsMetadata(fileName));
            }
        }
    }

    @Override
    public List<TabsMetadata> getMetadata() {
        return (List<TabsMetadata>) super.getMetadata();
    }
}

package sandbox.oleksii.project.metadata.pages;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Pages extends Folder {

    public static final String CLASS_EXTENSION = ".page";

    public Pages(String rootPath) {
        super(rootPath + "/pages");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new PagesMetadata(fileName));
            }
        }
    }

    @Override
    public List<PagesMetadata> getMetadata() {
        return (List<PagesMetadata>) super.getMetadata();
    }
}

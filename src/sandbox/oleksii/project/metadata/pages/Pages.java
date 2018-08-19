package sandbox.oleksii.project.metadata.pages;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Pages extends MetadataFolder {

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
                this.metadata.add(new PageMetadata(fileName));
            }
        }
    }

    @Override
    public List<PageMetadata> getMetadata() {
        return (List<PageMetadata>) super.getMetadata();
    }
}

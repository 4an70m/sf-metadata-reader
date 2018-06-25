package sandbox.oleksii.project.metadata.sites;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Sites extends Folder {

    public static final String CLASS_EXTENSION = ".site";

    public Sites(String rootPath) {
        super(rootPath + "/sites");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new SitesMetadata(fileName));
            }
        }
    }

    @Override
    public List<SitesMetadata> getMetadata() {
        return (List<SitesMetadata>) super.getMetadata();
    }
}

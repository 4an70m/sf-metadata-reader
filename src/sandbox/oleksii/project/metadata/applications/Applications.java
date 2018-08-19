package sandbox.oleksii.project.metadata.applications;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Applications extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".app";

    public Applications(String rootPath) {
        super(rootPath + "/applications");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ApplicationMetadata(fileName));
            }
        }
    }

    @Override
    public List<ApplicationMetadata> getMetadata() {
        return (List<ApplicationMetadata>) super.getMetadata();
    }
}

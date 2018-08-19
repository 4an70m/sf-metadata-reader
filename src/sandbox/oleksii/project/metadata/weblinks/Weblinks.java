package sandbox.oleksii.project.metadata.weblinks;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Weblinks extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".weblink";

    public Weblinks(String rootPath) {
        super(rootPath + "/weblinks");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new WeblinkMetadata(fileName));
            }
        }
    }

    @Override
    public List<WeblinkMetadata> getMetadata() {
        return (List<WeblinkMetadata>) super.getMetadata();
    }
}

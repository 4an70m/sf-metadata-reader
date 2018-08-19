package sandbox.oleksii.project.metadata.objects;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Objects extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".object";

    public Objects(String rootPath) {
        super(rootPath + "/objects");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ObjectMetadata(fileName));
            }
        }
    }

    @Override
    public List<ObjectMetadata> getMetadata() {
        return (List<ObjectMetadata>) super.getMetadata();
    }
}

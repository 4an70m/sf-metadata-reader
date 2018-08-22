package sandbox.oleksii.project.metadata.classes;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Classes extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".cls";

    public Classes(String rootPath) {
        super(rootPath + "/classes");
    }

    @Override
    public List<ClassMetadata> getMetadata() {
        return (List<ClassMetadata>) super.getMetadata();
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ClassMetadata(fileName));
            }
        }
    }
}
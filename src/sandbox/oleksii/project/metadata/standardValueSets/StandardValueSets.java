package sandbox.oleksii.project.metadata.standardValueSets;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class StandardValueSets extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".standardValueSet";

    public StandardValueSets(String rootPath) {
        super(rootPath + "/standardValueSets");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new StandardValueSetMetadata(fileName));
            }
        }
    }

    @Override
    public List<StandardValueSetMetadata> getMetadata() {
        return (List<StandardValueSetMetadata>) super.getMetadata();
    }
}

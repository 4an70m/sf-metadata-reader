package sandbox.oleksii.project.metadata.standardValueSets;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class StandardValueSets extends Folder {

    public static final String CLASS_EXTENSION = ".standardValueSet";

    public StandardValueSets(String rootPath) {
        super(rootPath + "/standardValueSets");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new StandardValueSetsMetadata(fileName));
            }
        }
    }

    @Override
    public List<StandardValueSetsMetadata> getMetadata() {
        return (List<StandardValueSetsMetadata>) super.getMetadata();
    }
}

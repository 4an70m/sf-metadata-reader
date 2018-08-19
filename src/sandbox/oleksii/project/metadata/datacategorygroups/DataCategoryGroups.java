package sandbox.oleksii.project.metadata.datacategorygroups;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class DataCategoryGroups extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".datacategorygroup";

    public DataCategoryGroups(String rootPath) {
        super(rootPath + "/datacategorygroups");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new DataCategoryGroupMetadata(fileName));
            }
        }
    }

    @Override
    public List<DataCategoryGroupMetadata> getMetadata() {
        return (List<DataCategoryGroupMetadata>) super.getMetadata();
    }
}

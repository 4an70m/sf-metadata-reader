package sandbox.oleksii.project.metadata.datacategorygroups;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class DataCategoryGroups extends Folder {

    public static final String CLASS_EXTENSION = ".datacategorygroup";

    public DataCategoryGroups(String rootPath) {
        super(rootPath + "/datacategorygroups");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new DataCategoryGroupsMetadata(fileName));
            }
        }
    }

    @Override
    public List<DataCategoryGroupsMetadata> getMetadata() {
        return (List<DataCategoryGroupsMetadata>) super.getMetadata();
    }
}

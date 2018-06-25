package sandbox.oleksii.project.metadata.delegategroups;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class DelegateGroups extends Folder {

    public static final String CLASS_EXTENSION = ".delegateGroup";

    public DelegateGroups(String rootPath) {
        super(rootPath + "/delegateGroups");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new DelegateGroupsMetadata(fileName));
            }
        }
    }

    @Override
    public List<DelegateGroupsMetadata> getMetadata() {
        return (List<DelegateGroupsMetadata>) super.getMetadata();
    }
}

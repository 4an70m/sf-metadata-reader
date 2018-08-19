package sandbox.oleksii.project.metadata.delegategroups;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class DelegateGroups extends MetadataFolder {

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
                this.metadata.add(new DelegateGroupMetadata(fileName));
            }
        }
    }

    @Override
    public List<DelegateGroupMetadata> getMetadata() {
        return (List<DelegateGroupMetadata>) super.getMetadata();
    }
}

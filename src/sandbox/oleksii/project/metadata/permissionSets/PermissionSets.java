package sandbox.oleksii.project.metadata.permissionSets;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by 4an70m on 28.06.2018.
 */
public class PermissionSets extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".permissionset";

    public PermissionSets(String rootPath) {
        super(rootPath + "/permissionsets");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            if (CLASS_EXTENSION.equals(this.getExtension(fileName))) {
                this.metadata.add(new PermissionSetMetadata(fileName));
            }
        }
    }

    @Override
    public List<PermissionSetMetadata> getMetadata() {
        return (List<PermissionSetMetadata>) super.getMetadata();
    }
}
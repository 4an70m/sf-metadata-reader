package sandbox.oleksii.project.metadata.permissionSets;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by 4an70m on 28.06.2018.
 */
public class PermissionSets extends MetadataFolder {

    public PermissionSets(String rootPath) {
        super(rootPath + "/permissionsets");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFolderPaths();
        for (String fileName : filePaths) {
            this.metadata.add(new PermissionSetMetadata(fileName));
        }
    }

    @Override
    public List<PermissionSetMetadata> getMetadata() {
        return (List<PermissionSetMetadata>) super.getMetadata();
    }

}

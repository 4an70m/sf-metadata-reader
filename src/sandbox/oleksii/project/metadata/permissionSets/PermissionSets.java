package sandbox.oleksii.project.metadata.permissionSets;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by 4an70m on 28.06.2018.
 */
public class PermissionSets extends Folder {

    public PermissionSets(String rootPath) {
        super(rootPath + "/permissionsets");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFolderPaths();
        for (String fileName : filePaths) {
            this.metadata.add(new PermissionSetsMetadata(fileName));
        }
    }

    @Override
    public List<PermissionSetsMetadata> getMetadata() {
        return (List<PermissionSetsMetadata>) super.getMetadata();
    }

}

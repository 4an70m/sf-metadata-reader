package sandbox.oleksii.project.metadata.dashboards;

import sandbox.oleksii.project.core.files.Metadata;
import sandbox.oleksii.project.core.folders.ContainerFolder;
import sandbox.oleksii.project.core.folders.FolderWithMeta;

import java.util.List;

/**
 * Created by User on 08.01.2018.
 */
public class Dashboards extends ContainerFolder {

    public Dashboards(String rootPath) {
        super(rootPath + "/dashboards");
    }

    @Override
    protected void readFolders() {
        List<String> folderPaths = this.getListOfFolderPaths();
        for (String folderPath : folderPaths) {
            this.folders.add(new DashboardFolder(folderPath));
        }
    }


}

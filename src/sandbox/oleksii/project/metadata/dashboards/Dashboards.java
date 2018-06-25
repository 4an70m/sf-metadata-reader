package sandbox.oleksii.project.metadata.dashboards;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 08.01.2018.
 */
public class Dashboards extends Folder {

    public Dashboards(String rootPath) {
        super(rootPath + "/dashboards");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFolderPaths();
        for (String fileName : filePaths) {
            this.metadata.add(new DashboardsFolder(fileName));
        }
    }

    @Override
    public List<DashboardsFolder> getMetadata() {
        return (List<DashboardsFolder>) super.getMetadata();
    }
}

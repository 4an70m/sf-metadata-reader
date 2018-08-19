package sandbox.oleksii.project.metadata.dashboards;

import sandbox.oleksii.project.core.folders.FolderWithMeta;

import java.util.List;

/**
 * Created by 4an70m on 18.08.2018.
 */
public class DashboardFolder extends FolderWithMeta {

    public static final String CLASS_EXTENSION = ".dashboard";

    public DashboardFolder(String path) {
        super(path);
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new DashboardMetadata(fileName));
            }
        }
    }

    @Override
    protected DashboardFolderXmlMeta readRelatedMetaFile() {
        return new DashboardFolderXmlMeta(this.getPath() + DashboardFolderXmlMeta.META_XML_EXTENSION);
    }
}

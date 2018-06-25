package sandbox.oleksii.project.metadata.cleanDataServices;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class CleanDataServices extends Folder {

    public static final String CLASS_EXTENSION = ".cleanDataService";

    public CleanDataServices(String rootPath) {
        super(rootPath + "/cleanDataServices");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new CleanDataServicesMetadata(fileName));
            }
        }
    }

    @Override
    public List<CleanDataServicesMetadata> getMetadata() {
        return (List<CleanDataServicesMetadata>) super.getMetadata();
    }
}

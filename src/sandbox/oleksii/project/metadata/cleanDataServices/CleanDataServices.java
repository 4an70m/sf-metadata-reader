package sandbox.oleksii.project.metadata.cleanDataServices;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class CleanDataServices extends MetadataFolder {

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
                this.metadata.add(new CleanDataServiceMetadata(fileName));
            }
        }
    }

    @Override
    public List<CleanDataServiceMetadata> getMetadata() {
        return (List<CleanDataServiceMetadata>) super.getMetadata();
    }
}

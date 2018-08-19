package sandbox.oleksii.project.metadata.labels;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Labels extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".labels";

    public Labels(String rootPath) {
        super(rootPath + "/labels");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new LabelsMetadata(fileName));
            }
        }
    }

    @Override
    public List<LabelsMetadata> getMetadata() {
        return (List<LabelsMetadata>) super.getMetadata();
    }
}

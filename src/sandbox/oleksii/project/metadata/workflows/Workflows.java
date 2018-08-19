package sandbox.oleksii.project.metadata.workflows;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Workflows extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".workflow";

    public Workflows(String rootPath) {
        super(rootPath + "/workflows");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new WorkflowMetadata(fileName));
            }
        }
    }

    @Override
    public List<WorkflowMetadata> getMetadata() {
        return (List<WorkflowMetadata>) super.getMetadata();
    }
}

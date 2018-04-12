package sandbox.oleksii.project.metadata.workflows;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Workflows extends Folder {

    public static final String CLASS_EXTENSION = ".workflow";

    public Workflows(String rootPath) {
        super(rootPath + "/workflows");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new WorkflowsMetadata(fileName));
            }
        }
    }

    @Override
    public List<WorkflowsMetadata> getMetadata() {
        return (List<WorkflowsMetadata>) super.getMetadata();
    }
}

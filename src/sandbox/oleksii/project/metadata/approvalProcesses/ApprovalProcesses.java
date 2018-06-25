package sandbox.oleksii.project.metadata.approvalProcesses;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class ApprovalProcesses extends Folder {

    public static final String CLASS_EXTENSION = ".approvalProcess";

    public ApprovalProcesses(String rootPath) {
        super(rootPath + "/approvalProcesses");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ApprovalProcessMetadata(fileName));
            }
        }
    }

    @Override
    public List<ApprovalProcessMetadata> getMetadata() {
        return (List<ApprovalProcessMetadata>) super.getMetadata();
    }
}

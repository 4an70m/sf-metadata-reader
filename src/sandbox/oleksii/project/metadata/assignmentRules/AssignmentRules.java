package sandbox.oleksii.project.metadata.assignmentRules;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class AssignmentRules extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".assignmentRules";

    public AssignmentRules(String rootPath) {
        super(rootPath + "/assignmentRules");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new AssignmentRuleMetadata(fileName));
            }
        }
    }

    @Override
    public List<AssignmentRuleMetadata> getMetadata() {
        return (List<AssignmentRuleMetadata>) super.getMetadata();
    }
}

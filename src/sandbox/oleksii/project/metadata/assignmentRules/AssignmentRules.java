package sandbox.oleksii.project.metadata.assignmentRules;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class AssignmentRules extends Folder {

    public static final String CLASS_EXTENSION = ".assignmentRules";

    public AssignmentRules(String rootPath) {
        super(rootPath + "/assignmentRules");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new AssignmentRulesMetadata(fileName));
            }
        }
    }

    @Override
    public List<AssignmentRulesMetadata> getMetadata() {
        return (List<AssignmentRulesMetadata>) super.getMetadata();
    }
}

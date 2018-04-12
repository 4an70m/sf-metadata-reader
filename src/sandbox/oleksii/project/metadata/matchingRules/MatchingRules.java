package sandbox.oleksii.project.metadata.matchingRules;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class MatchingRules extends Folder {

    public static final String CLASS_EXTENSION = ".matchingRule";

    public MatchingRules(String rootPath) {
        super(rootPath + "/matchingRules");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new MatchingRulesMetadata(fileName));
            }
        }
    }

    @Override
    public List<MatchingRulesMetadata> getMetadata() {
        return (List<MatchingRulesMetadata>) super.getMetadata();
    }
}

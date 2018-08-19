package sandbox.oleksii.project.metadata.matchingRules;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class MatchingRules extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".matchingRule";

    public MatchingRules(String rootPath) {
        super(rootPath + "/matchingRules");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new MatchingRuleMetadata(fileName));
            }
        }
    }

    @Override
    public List<MatchingRuleMetadata> getMetadata() {
        return (List<MatchingRuleMetadata>) super.getMetadata();
    }
}

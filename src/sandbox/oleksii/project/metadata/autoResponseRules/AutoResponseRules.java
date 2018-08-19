package sandbox.oleksii.project.metadata.autoResponseRules;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class AutoResponseRules extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".autoResponseRules";

    public AutoResponseRules(String rootPath) {
        super(rootPath + "/autoResponseRules");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new AutoResponseRuleMetadata(fileName));
            }
        }
    }

    @Override
    public List<AutoResponseRuleMetadata> getMetadata() {
        return (List<AutoResponseRuleMetadata>) super.getMetadata();
    }
}

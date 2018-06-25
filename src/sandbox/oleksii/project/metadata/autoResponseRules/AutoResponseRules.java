package sandbox.oleksii.project.metadata.autoResponseRules;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class AutoResponseRules extends Folder {

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
                this.metadata.add(new AutoResponseRulesMetadata(fileName));
            }
        }
    }

    @Override
    public List<AutoResponseRulesMetadata> getMetadata() {
        return (List<AutoResponseRulesMetadata>) super.getMetadata();
    }
}

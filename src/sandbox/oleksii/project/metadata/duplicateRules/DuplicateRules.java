package sandbox.oleksii.project.metadata.duplicateRules;

import sandbox.oleksii.project.core.folders.MetadataFolder;
import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class DuplicateRules extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".duplicateRule";

    public DuplicateRules(String rootPath) {
        super(rootPath + "/duplicateRules");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new DuplicateRuleMetadata(fileName));
            }
        }
    }

    @Override
    public List<DuplicateRuleMetadata> getMetadata() {return (List<DuplicateRuleMetadata>) super.getMetadata();}
}
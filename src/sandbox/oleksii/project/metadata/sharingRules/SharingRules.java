package sandbox.oleksii.project.metadata.sharingRules;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class SharingRules extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".sharingRules";

    public SharingRules(String rootPath) {
        super(rootPath + "/sharingRules");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new SharingRuleMetadata(fileName));
            }
        }
    }

    @Override
    public List<SharingRuleMetadata> getMetadata() {
        return (List<SharingRuleMetadata>) super.getMetadata();
    }
}

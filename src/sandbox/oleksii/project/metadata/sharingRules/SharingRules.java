package sandbox.oleksii.project.metadata.sharingRules;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class SharingRules extends Folder {

    public static final String CLASS_EXTENSION = ".sharingRules";

    public SharingRules(String rootPath) {
        super(rootPath + "/sharingRules");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new SharingRulesMetadata(fileName));
            }
        }
    }

    @Override
    public List<SharingRulesMetadata> getMetadata() {
        return (List<SharingRulesMetadata>) super.getMetadata();
    }
}

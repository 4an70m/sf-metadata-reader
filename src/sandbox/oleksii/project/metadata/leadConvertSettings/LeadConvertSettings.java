package sandbox.oleksii.project.metadata.leadConvertSettings;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class LeadConvertSettings extends Folder {

    public static final String CLASS_EXTENSION = ".LeadConvertSetting";

    public LeadConvertSettings(String rootPath) {
        super(rootPath + "/LeadConvertSettings");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new LeadConvertSettingsMetadata(fileName));
            }
        }
    }

    @Override
    public List<LeadConvertSettingsMetadata> getMetadata() {
        return (List<LeadConvertSettingsMetadata>) super.getMetadata();
    }
}

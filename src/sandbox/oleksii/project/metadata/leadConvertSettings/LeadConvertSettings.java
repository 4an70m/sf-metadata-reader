package sandbox.oleksii.project.metadata.leadConvertSettings;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class LeadConvertSettings extends MetadataFolder {

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
                this.metadata.add(new LeadConvertSettingMetadata(fileName));
            }
        }
    }

    @Override
    public List<LeadConvertSettingMetadata> getMetadata() {
        return (List<LeadConvertSettingMetadata>) super.getMetadata();
    }
}

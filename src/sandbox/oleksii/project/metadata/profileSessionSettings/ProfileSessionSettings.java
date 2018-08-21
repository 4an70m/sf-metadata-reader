package sandbox.oleksii.project.metadata.profileSessionSettings;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class ProfileSessionSettings extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".profileSessionSetting";

    public ProfileSessionSettings(String rootPath) {
        super(rootPath + "/profileSessionSettings");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ProfileSessionSettingMetadata(fileName));
            }
        }
    }

    @Override
    public List<ProfileSessionSettingMetadata> getMetadata() {
        return (List<ProfileSessionSettingMetadata>) super.getMetadata();
    }
}

package sandbox.oleksii.project.metadata.remoteSiteSettings;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 21.08.2018.
 */
public class RemoteSiteSettings extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".remoteSite";

    public RemoteSiteSettings(String rootPath) {
        super(rootPath + "/remoteSiteSettings");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new RemoteSiteSettingMetadata(fileName));
            }
        }
    }

    @Override
    public List<RemoteSiteSettingMetadata> getMetadata() {
        return (List<RemoteSiteSettingMetadata>) super.getMetadata();
    }
}

package sandbox.oleksii.project.metadata.profilePasswordPolicies;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class ProfilePasswordPolicies extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".profilePasswordPolicy";

    public ProfilePasswordPolicies(String rootPath) {
        super(rootPath + "/profilePasswordPolicies");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ProfilePasswordPolicyMetadata(fileName));
            }
        }
    }

    @Override
    public List<ProfilePasswordPolicyMetadata> getMetadata() {
        return (List<ProfilePasswordPolicyMetadata>) super.getMetadata();
    }
}

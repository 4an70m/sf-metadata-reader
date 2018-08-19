package sandbox.oleksii.project.metadata.communities;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Communities extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".community";

    public Communities(String rootPath) {
        super(rootPath + "/communities");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new CommunityMetadata(fileName));
            }
        }
    }

    @Override
    public List<CommunityMetadata> getMetadata() {
        return (List<CommunityMetadata>) super.getMetadata();
    }
}

package sandbox.oleksii.project.metadata.communities;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Communities extends Folder {

    public static final String CLASS_EXTENSION = ".community";

    public Communities(String rootPath) {
        super(rootPath + "/communities");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new CommunitiesMetadata(fileName));
            }
        }
    }

    @Override
    public List<CommunitiesMetadata> getMetadata() {
        return (List<CommunitiesMetadata>) super.getMetadata();
    }
}

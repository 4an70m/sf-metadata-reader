package sandbox.oleksii.project.metadata.groups;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Groups extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".group";

    public Groups(String rootPath) {
        super(rootPath + "/groups");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new GroupMetadata(fileName));
            }
        }
    }

    @Override
    public List<GroupMetadata> getMetadata() {
        return (List<GroupMetadata>) super.getMetadata();
    }
}

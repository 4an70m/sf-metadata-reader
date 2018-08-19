package sandbox.oleksii.project.metadata.roles;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class Roles extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".role";

    public Roles(String rootPath) {
        super(rootPath + "/roles");
    }

    @Override
    public List<RoleMetadata> getMetadata() {
        return (List<RoleMetadata>) super.getMetadata();
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new RoleMetadata(fileName));
            }
        }
    }
}

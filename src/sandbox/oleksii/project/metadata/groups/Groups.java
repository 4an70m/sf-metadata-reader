package sandbox.oleksii.project.metadata.groups;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Groups extends Folder {

    public static final String CLASS_EXTENSION = ".group";

    public Groups(String rootPath) {
        super(rootPath + "/groups");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new GroupsMetadata(fileName));
            }
        }
    }

    @Override
    public List<GroupsMetadata> getMetadata() {
        return (List<GroupsMetadata>) super.getMetadata();
    }
}

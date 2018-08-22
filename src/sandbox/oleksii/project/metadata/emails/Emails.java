package sandbox.oleksii.project.metadata.emails;

import sandbox.oleksii.project.core.folders.ContainerFolder;

import java.util.List;

/**
 * Created by User on 22.08.2018.
 */
public class Emails extends ContainerFolder {

    public Emails(String rootPath) {
        super(rootPath + "/email");
    }

    @Override
    protected void readFolders() {
        List<String> folderPaths = this.getListOfFolderPaths();
        for (String folderPath : folderPaths) {
            this.folders.add(new EmailFolder(folderPath));
        }
    }


}

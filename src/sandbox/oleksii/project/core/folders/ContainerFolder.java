package sandbox.oleksii.project.core.folders;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 4an70m on 18.08.2018.
 */
public abstract class ContainerFolder extends Folder {

    protected List<Folder> folders;

    public ContainerFolder(String path) {
        super(path);
        this.folders = new ArrayList<>();
        this.readFolders();
    }

    public List<Folder> getFolders() {
        return folders;
    }

    protected abstract void readFolders();
}

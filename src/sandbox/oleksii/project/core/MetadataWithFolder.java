package sandbox.oleksii.project.core;

/**
 * Created by User on 09.01.2018.
 */
public abstract class MetadataWithFolder extends Metadata {

    protected Folder folder;

    public MetadataWithFolder(String pathname) {
        super(pathname);
    }

    public Folder getFolder() {
        return this.folder;
    }
}

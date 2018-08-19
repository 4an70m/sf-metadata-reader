package sandbox.oleksii.project.core.folders;

import sandbox.oleksii.project.core.files.Metadata;
import sandbox.oleksii.project.core.files.TextualMetadata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public abstract class MetadataFolder extends Folder {

    protected List<Metadata> metadata;

    public MetadataFolder(String path) {
        super(path);
        this.metadata = new ArrayList<>();
        this.readMetadata();
    }

    protected abstract void readMetadata();

    public List<? extends Metadata> getMetadata() {
        return metadata;
    }
}

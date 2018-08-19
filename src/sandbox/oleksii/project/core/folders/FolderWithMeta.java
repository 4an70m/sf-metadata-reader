package sandbox.oleksii.project.core.folders;

import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by 4an70m on 18.08.2018.
 */
public abstract class FolderWithMeta extends MetadataFolder {

    protected XmlMetadata meta;

    public FolderWithMeta(String path) {
        super(path);
        this.meta = this.readRelatedMetaFile();
    }

    protected abstract XmlMetadata readRelatedMetaFile();

    public XmlMetadata getRelatedMeta() {
        return meta;
    }
}

package sandbox.oleksii.project.metadata.triggers;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class TriggersMetadata extends Metadata {

    private TriggersMetaMetadata relatedMeta;

    public TriggersMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new TriggersMetaMetadata(fileName + CLASS_META_EXTENSION);
    }

    public TriggersMetaMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

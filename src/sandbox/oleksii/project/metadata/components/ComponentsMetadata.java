package sandbox.oleksii.project.metadata.components;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class ComponentsMetadata extends Metadata {

    private ComponentsMetaMetadata relatedMeta;

    public ComponentsMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new ComponentsMetaMetadata(fileName + CLASS_META_EXTENSION);
    }

    public ComponentsMetaMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

package sandbox.oleksii.project.metadata.staticResources;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class StaticResourcesMetadata extends Metadata {

    private StaticResourcesMetaMetadata relatedMeta;

    public StaticResourcesMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new StaticResourcesMetaMetadata(fileName + CLASS_META_EXTENSION);
    }

    public StaticResourcesMetaMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

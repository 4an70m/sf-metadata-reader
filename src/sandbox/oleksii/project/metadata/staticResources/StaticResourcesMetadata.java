package sandbox.oleksii.project.metadata.staticResources;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class StaticResourcesMetadata extends Metadata {

    private StaticResourcesXmlMetadata relatedMeta;

    public StaticResourcesMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new StaticResourcesXmlMetadata(fileName + META_XML_EXTENSION);
    }

    public StaticResourcesXmlMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

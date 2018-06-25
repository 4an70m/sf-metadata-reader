package sandbox.oleksii.project.metadata.components;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class ComponentsMetadata extends Metadata {

    private ComponentsXmlMetadata relatedMeta;

    public ComponentsMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new ComponentsXmlMetadata(fileName + META_XML_EXTENSION);
    }

    public ComponentsXmlMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

package sandbox.oleksii.project.metadata.triggers;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class TriggersMetadata extends Metadata {

    private TriggersXmlMetadata relatedMeta;

    public TriggersMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new TriggersXmlMetadata(fileName + META_XML_EXTENSION);
    }

    public TriggersXmlMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

package sandbox.oleksii.project.metadata.certs;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class CertsMetadata extends Metadata {

    private CertsXmlMetadata relatedMeta;

    public CertsMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new CertsXmlMetadata(fileName + META_XML_EXTENSION);
    }

    public CertsXmlMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

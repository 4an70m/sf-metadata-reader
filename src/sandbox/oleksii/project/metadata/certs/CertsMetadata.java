package sandbox.oleksii.project.metadata.certs;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class CertsMetadata extends Metadata {

    private CertsMetaMetadata relatedMeta;

    public CertsMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new CertsMetaMetadata(fileName + CLASS_META_EXTENSION);
    }

    public CertsMetaMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

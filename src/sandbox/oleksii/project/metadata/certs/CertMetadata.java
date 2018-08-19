package sandbox.oleksii.project.metadata.certs;

import sandbox.oleksii.project.core.files.TextualMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class CertMetadata extends TextualMetadata {

    private CertXmlMeta relatedMeta;

    public CertMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new CertXmlMeta(fileName + META_XML_EXTENSION);
    }

    public CertXmlMeta getRelatedMeta() {
        return relatedMeta;
    }

}

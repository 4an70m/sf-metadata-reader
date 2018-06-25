package sandbox.oleksii.project.metadata.pages;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class PagesMetadata extends Metadata {

    private PagesXmlMetadata relatedMeta;

    public PagesMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new PagesXmlMetadata(fileName + META_XML_EXTENSION);
    }

    public PagesXmlMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

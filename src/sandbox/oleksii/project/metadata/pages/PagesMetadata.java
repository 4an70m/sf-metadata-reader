package sandbox.oleksii.project.metadata.pages;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class PagesMetadata extends Metadata {

    private PagesMetaMetadata relatedMeta;

    public PagesMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new PagesMetaMetadata(fileName + CLASS_META_EXTENSION);
    }

    public PagesMetaMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

package sandbox.oleksii.project.metadata.pages;

import sandbox.oleksii.project.core.files.TextualMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class PageMetadata extends TextualMetadata {

    private PageXmlMeta relatedMeta;

    public PageMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new PageXmlMeta(fileName + META_XML_EXTENSION);
    }

    public PageXmlMeta getRelatedMeta() {
        return relatedMeta;
    }

}

package sandbox.oleksii.project.metadata.scontrols;

import sandbox.oleksii.project.core.files.TextualMetadata;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class SControlMetadata extends TextualMetadata {

    private SControlXmlMeta relatedMeta;

    public SControlMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new SControlXmlMeta(fileName + META_XML_EXTENSION);
    }

    public SControlXmlMeta getRelatedMeta() {
        return relatedMeta;
    }
}
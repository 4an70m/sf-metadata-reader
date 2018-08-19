package sandbox.oleksii.project.metadata.triggers;

import sandbox.oleksii.project.core.files.TextualMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class TriggerMetadata extends TextualMetadata {

    private TriggerXmlMeta relatedMeta;

    public TriggerMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new TriggerXmlMeta(fileName + META_XML_EXTENSION);
    }

    public TriggerXmlMeta getRelatedMeta() {
        return relatedMeta;
    }

}

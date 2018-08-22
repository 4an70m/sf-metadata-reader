package sandbox.oleksii.project.metadata.emails;

import sandbox.oleksii.project.core.files.TextualMetadata;

/**
 * Created by User on 22.08.2018.
 */
public class EmailMetadata extends TextualMetadata {

    private EmailXmlMeta relatedMeta;

    public EmailMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new EmailXmlMeta(fileName + META_XML_EXTENSION);
    }

    public EmailXmlMeta getRelatedMeta() {
        return relatedMeta;
    }
}
package sandbox.oleksii.project.metadata.classes;

import sandbox.oleksii.project.core.files.TextualMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class ClassMetadata extends TextualMetadata {

    private ClassXmlMeta relatedMeta;

    public ClassMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new ClassXmlMeta(fileName + META_XML_EXTENSION);
    }

    public ClassXmlMeta getRelatedMeta() {
        return relatedMeta;
    }

}

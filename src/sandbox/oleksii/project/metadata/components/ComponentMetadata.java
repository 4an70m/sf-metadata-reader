package sandbox.oleksii.project.metadata.components;

import sandbox.oleksii.project.core.files.TextualMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class ComponentMetadata extends TextualMetadata {

    private ComponentXmlMeta relatedMeta;

    public ComponentMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new ComponentXmlMeta(fileName + META_XML_EXTENSION);
    }

    public ComponentXmlMeta getRelatedMeta() {
        return relatedMeta;
    }

}

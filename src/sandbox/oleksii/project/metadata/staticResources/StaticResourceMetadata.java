package sandbox.oleksii.project.metadata.staticResources;

import sandbox.oleksii.project.core.files.TextualMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class StaticResourceMetadata extends TextualMetadata {

    private StaticResourceXmlMeta relatedMeta;

    public StaticResourceMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new StaticResourceXmlMeta(fileName + META_XML_EXTENSION);
    }

    public StaticResourceXmlMeta getRelatedMeta() {
        return relatedMeta;
    }

}

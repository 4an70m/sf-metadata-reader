package sandbox.oleksii.project.metadata.classes;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class ClassesMetadata extends Metadata {

    private ClassesXmlMetadata relatedMeta;

    public ClassesMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new ClassesXmlMetadata(fileName + META_XML_EXTENSION);
    }

    public ClassesXmlMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

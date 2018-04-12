package sandbox.oleksii.project.metadata.classes;

import sandbox.oleksii.project.core.Metadata;

/**
 * Created by User on 05.01.2018.
 */
public class ClassesMetadata extends Metadata {

    private ClassesMetaMetadata relatedMeta;

    public ClassesMetadata(String fileName) {
        super(fileName);
        this.relatedMeta = new ClassesMetaMetadata(fileName + CLASS_META_EXTENSION);
    }

    public ClassesMetaMetadata getRelatedMeta() {
        return relatedMeta;
    }

}

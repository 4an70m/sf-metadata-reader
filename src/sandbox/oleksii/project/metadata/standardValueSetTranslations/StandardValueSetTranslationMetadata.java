package sandbox.oleksii.project.metadata.standardValueSetTranslations;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class StandardValueSetTranslationMetadata extends XmlMetadata {

    public StandardValueSetTranslationMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister(new AnnotationStrategy());
        try {
            this.entity = serializer.read(StandardValueSetTranslationPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

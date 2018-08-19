package sandbox.oleksii.project.metadata.translations;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class TranslationMetadata extends XmlMetadata {

    public TranslationMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister(new AnnotationStrategy());
        try {
            this.entity = serializer.read(TranslationPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

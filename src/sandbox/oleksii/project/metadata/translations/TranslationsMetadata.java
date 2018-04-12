package sandbox.oleksii.project.metadata.translations;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class TranslationsMetadata extends XmlMetadata {

    public TranslationsMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister(new AnnotationStrategy());
        try {
            this.entity = serializer.read(TranslationsPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

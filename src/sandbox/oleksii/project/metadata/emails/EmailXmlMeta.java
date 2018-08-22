package sandbox.oleksii.project.metadata.emails;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 22.08.2018.
 */
public class EmailXmlMeta extends XmlMetadata {

    public EmailXmlMeta(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(EmailPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

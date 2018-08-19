package sandbox.oleksii.project.metadata.objects;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class ObjectMetadata extends XmlMetadata {

    public ObjectMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(ObjectPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package sandbox.oleksii.project.metadata.objects;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class ObjectsMetadata extends XmlMetadata {

    public ObjectsMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(ObjectsPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

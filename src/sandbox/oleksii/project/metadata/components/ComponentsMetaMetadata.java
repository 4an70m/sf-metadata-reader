package sandbox.oleksii.project.metadata.components;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class ComponentsMetaMetadata extends XmlMetadata {

    public ComponentsMetaMetadata(String pathname) {
        super(pathname);
    }

    @Override
    public void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(ComponentsMetaPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


package sandbox.oleksii.project.metadata.components;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class ComponentXmlMeta extends XmlMetadata {

    public ComponentXmlMeta(String pathname) {
        super(pathname);
    }

    @Override
    public void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(ComponentXmlMetaPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


package sandbox.oleksii.project.metadata.staticResources;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class StaticResourceXmlMeta extends XmlMetadata {

    public StaticResourceXmlMeta(String pathname) {
        super(pathname);
    }

    @Override
    public void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(StaticResourceXmlMetaPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


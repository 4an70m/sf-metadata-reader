package sandbox.oleksii.project.metadata.staticResources;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class StaticResourcesMetaMetadata extends XmlMetadata {

    public StaticResourcesMetaMetadata(String pathname) {
        super(pathname);
    }

    @Override
    public void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(StaticResourcesMetaPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


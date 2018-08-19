package sandbox.oleksii.project.metadata.triggers;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class TriggerXmlMeta extends XmlMetadata {

    public TriggerXmlMeta(String pathname) {
        super(pathname);
    }

    @Override
    public void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(TriggerXmlMetaPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


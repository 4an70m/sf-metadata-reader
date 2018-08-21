package sandbox.oleksii.project.metadata.portals;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 21.08.2018.
 */
public class PortalMetadata extends XmlMetadata {

    public PortalMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(PortalMetadataPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

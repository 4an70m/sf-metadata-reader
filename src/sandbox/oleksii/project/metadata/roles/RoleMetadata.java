package sandbox.oleksii.project.metadata.roles;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;
import sandbox.oleksii.project.metadata.groups.GroupPojo;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class RoleMetadata extends XmlMetadata {

    public RoleMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(RoleMetadataPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

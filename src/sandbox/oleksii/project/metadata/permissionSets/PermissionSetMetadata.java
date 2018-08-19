package sandbox.oleksii.project.metadata.permissionSets;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by 4an70m on 28.06.2018.
 */
public class PermissionSetMetadata extends XmlMetadata {

    public PermissionSetMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(PermissionSetPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
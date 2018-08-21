package sandbox.oleksii.project.metadata.quickActions;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 21.08.2018.
 */
public class QuickActionMetadata extends XmlMetadata {

    public QuickActionMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(QuickActionPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

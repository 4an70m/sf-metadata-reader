package sandbox.oleksii.project.metadata.applications;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class ApplicationsMetadata extends XmlMetadata {

    public ApplicationsMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(ApplicationsPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

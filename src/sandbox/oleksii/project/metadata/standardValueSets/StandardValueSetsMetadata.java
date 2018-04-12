package sandbox.oleksii.project.metadata.standardValueSets;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class StandardValueSetsMetadata extends XmlMetadata {

    public StandardValueSetsMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(StandardValueSetsPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

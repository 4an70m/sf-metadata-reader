package sandbox.oleksii.project.metadata.labels;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class LabelsMetadata extends XmlMetadata {

    public LabelsMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(LabelsPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

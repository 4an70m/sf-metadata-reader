package sandbox.oleksii.project.metadata.flowDefinitions;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 23.08.2018.
 */
public class FlowDefinitionMetadata extends XmlMetadata {

    public FlowDefinitionMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(FlowDefinitionPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

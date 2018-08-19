package sandbox.oleksii.project.metadata.workflows;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class WorkflowMetadata extends XmlMetadata {

    public WorkflowMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(WorkflowPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

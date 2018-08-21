package sandbox.oleksii.project.metadata.reportTypes;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 20.08.2018.
 */
public class ReportTypeMetadata extends XmlMetadata {

    public ReportTypeMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(ReportTypePojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

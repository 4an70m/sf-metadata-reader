package sandbox.oleksii.project.metadata.scontrols;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class SControlXmlMeta extends XmlMetadata {

    public SControlXmlMeta(String pathname) {
        super(pathname);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(SControlXmlMetaPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

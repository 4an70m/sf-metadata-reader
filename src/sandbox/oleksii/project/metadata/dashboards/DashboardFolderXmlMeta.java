package sandbox.oleksii.project.metadata.dashboards;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by 4an70m on 18.08.2018.
 */
public class DashboardFolderXmlMeta extends XmlMetadata {

    public DashboardFolderXmlMeta(String pathname) {
        super(pathname);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(DashboardFolderXmlMetaPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

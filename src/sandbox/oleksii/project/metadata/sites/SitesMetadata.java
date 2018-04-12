package sandbox.oleksii.project.metadata.sites;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class SitesMetadata extends XmlMetadata {

    public SitesMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(SitesPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

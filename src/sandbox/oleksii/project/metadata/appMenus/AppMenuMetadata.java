package sandbox.oleksii.project.metadata.appMenus;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class AppMenuMetadata extends XmlMetadata {

    public AppMenuMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(AppMenuPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package sandbox.oleksii.project.metadata.homePageComponents.groups;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class HomePageComponentsMetadata extends XmlMetadata {

    public HomePageComponentsMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(HomePageComponentsPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

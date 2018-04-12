package sandbox.oleksii.project.metadata.classes;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class ClassesMetaMetadata extends XmlMetadata {

    public ClassesMetaMetadata(String pathname) {
        super(pathname);
    }

    @Override
    public void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(ClassesMetaPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


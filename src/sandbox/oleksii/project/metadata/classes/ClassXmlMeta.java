package sandbox.oleksii.project.metadata.classes;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class ClassXmlMeta extends XmlMetadata {

    public ClassXmlMeta(String pathname) {
        super(pathname);
    }

    @Override
    public ClassXmlMetaPojo getEntity() {
        return (ClassXmlMetaPojo) this.entity;
    }

    @Override
    public void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(ClassXmlMetaPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


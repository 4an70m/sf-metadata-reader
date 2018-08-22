package sandbox.oleksii.project.metadata.emails;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 22.08.2018.
 */
public class EmailFolderXmlMeta extends XmlMetadata {

    public EmailFolderXmlMeta(String pathname) {
        super(pathname);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(EmailFolderXmlMetaPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

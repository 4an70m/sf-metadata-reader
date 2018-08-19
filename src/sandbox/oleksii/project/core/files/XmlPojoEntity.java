package sandbox.oleksii.project.core.files;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by User on 05.01.2018.
 */
public abstract class XmlPojoEntity {

    public static final int XML_INDENT = 4;
    public static final String XML_PROLOG = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

    protected String toXml() throws Exception {
        Serializer serializer = new Persister(new Format(XML_INDENT, XML_PROLOG));
        Writer writer = new StringWriter();
        serializer.write(this, writer);
        return writer.toString();
    }

}

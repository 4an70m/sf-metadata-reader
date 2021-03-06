package sandbox.oleksii.project.metadata.staticResources;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="StaticResource")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class StaticResourceXmlMetaPojo extends XmlPojoEntity {

    @Element
    private String cacheControl;

    @Element
    private String contentType;

    @Element(required = false)
    private String description;
}
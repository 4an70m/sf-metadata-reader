package sandbox.oleksii.project.metadata.scontrols;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by 4an70m on 19.08.2018.
 */
@Root(name="ApexClass")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class SControlXmlMetaPojo extends XmlPojoEntity {

    @Element(required = false)
    private String fileName;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private String fileContent;

    @Element
    private String contentSource;

    @Element
    private String encodingKey;

    @Element
    private String name;

    @Element
    private Boolean supportsCaching;
}
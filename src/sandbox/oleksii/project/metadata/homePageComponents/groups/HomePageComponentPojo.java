package sandbox.oleksii.project.metadata.homePageComponents.groups;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="HomePageComponent")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class HomePageComponentPojo extends XmlPojoEntity {

    @Element(required = false)
    private String body;

    @ElementList(inline = true, required = false, entry = "links")
    private List<String> links;

    @Element
    private String pageComponentType;

    @Element(required = false)
    private String width;

    @Override
    public String toString() {
        return "HomePageComponentsPojo{" +
                "body=" + body +
                ", links=" + links +
                ", pageComponentType='" + pageComponentType + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}
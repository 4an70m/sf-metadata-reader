package sandbox.oleksii.project.metadata.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="ApexComponent")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ComponentsMetaPojo extends XmlPojoEntity {

    @Element
    private String apiVersion;

    @Element
    private String label;

    @Element(required = false)
    private String description;

    @Override
    public String toString() {
        return "ComponentsMetaPojo{" +
                "apiVersion='" + apiVersion + '\'' +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

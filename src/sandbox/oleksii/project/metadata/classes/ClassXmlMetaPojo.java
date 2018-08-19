package sandbox.oleksii.project.metadata.classes;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.classes.components.PackageVersions;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="ApexClass")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ClassXmlMetaPojo extends XmlPojoEntity {

    @Element
    private String apiVersion;

    @Element
    private String status;

    @Element(required = false)
    private PackageVersions packageVersions;

    @Override
    public String toString() {
        return "TriggersMetaPojo{" +
                "apiVersion='" + apiVersion + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}

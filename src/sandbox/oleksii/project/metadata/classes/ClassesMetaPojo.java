package sandbox.oleksii.project.metadata.classes;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;
import sandbox.oleksii.project.metadata.classes.components.PackageVersions;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="ApexClass")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ClassesMetaPojo extends XmlPojoEntity {

    @Element
    private String apiVersion;

    @Element
    private String status;

    @Element(required = false)
    private PackageVersions packageVersions;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TriggersMetaPojo{" +
                "apiVersion='" + apiVersion + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}

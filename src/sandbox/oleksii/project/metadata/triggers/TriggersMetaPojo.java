package sandbox.oleksii.project.metadata.triggers;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="ApexTrigger")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class TriggersMetaPojo extends XmlPojoEntity {

    @Element
    private String apiVersion;

    @Element
    private String status;

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

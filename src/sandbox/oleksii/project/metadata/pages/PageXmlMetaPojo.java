package sandbox.oleksii.project.metadata.pages;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.pages.components.PackageVersions;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="ApexPage")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class PageXmlMetaPojo extends XmlPojoEntity {

    @Element
    private String apiVersion;

    @Element
    private Boolean availableInTouch;

    @Element
    private Boolean confirmationTokenRequired;

    @Element
    private String label;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private PackageVersions packageVersions;

    @Override
    public String toString() {
        return "TriggersMetaPojo{" +
                "apiVersion='" + apiVersion + '\'' +
                ", availableInTouch=" + availableInTouch +
                ", confirmationTokenRequired=" + confirmationTokenRequired +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", packageVersions=" + packageVersions +
                '}';
    }
}

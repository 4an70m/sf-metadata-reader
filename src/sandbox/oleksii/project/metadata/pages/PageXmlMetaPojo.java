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


    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public PackageVersions getPackageVersions() {
        return packageVersions;
    }

    public void setPackageVersions(PackageVersions packageVersions) {
        this.packageVersions = packageVersions;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getAvailableInTouch() {
        return availableInTouch;
    }

    public void setAvailableInTouch(Boolean availableInTouch) {
        this.availableInTouch = availableInTouch;
    }

    public Boolean getConfirmationTokenRequired() {
        return confirmationTokenRequired;
    }

    public void setConfirmationTokenRequired(Boolean confirmationTokenRequired) {
        this.confirmationTokenRequired = confirmationTokenRequired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

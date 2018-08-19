package sandbox.oleksii.project.metadata.applications;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.applications.components.*;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="CustomApplication")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ApplicationPojo extends XmlPojoEntity {

    @Element(required = false)
    private CustomApplicationComponents customApplicationComponents;

    @Element(required = false)
    private String defaultLandingTab;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private String formFactors;

    @Element(required = false)
    private String label;

    @Element(required = false)
    private String logo;

    @Element(required = false)
    private String listRefreshMethod;

    @ElementList(entry = "pushNotification", required = false)
    private List<PushNotification> pushNotifications;

    @Element(required = false)
    private String saveUserSessions;

    @ElementList(inline = true, entry = "tab")
    private List<String> tabs;

    @Element(required = false)
    private String uiType;

    @Element(required = false)
    private String navType;

    @Element(required = false)
    private String setupExperience;

    @Element(required = false)
    private String utilityBar;

    @Element(required = false)
    private String detailPageRefreshMethod;

    @Element(required = false)
    private Boolean enableCustomizeMyTabs;

    @Element(required = false)
    private Boolean enableKeyboardShortcuts;

    @Element(required = false)
    private Boolean enableListViewHover;

    @Element(required = false)
    private Boolean enableListViewReskin;

    @Element(required = false)
    private Boolean enableMultiMonitorComponents;

    @Element(required = false)
    private Boolean enablePinTabs;

    @Element(required = false)
    private Boolean enableTabHover;

    @Element(required = false)
    private Boolean enableTabLimits;

    @Element(required = false)
    private Boolean isServiceCloudConsole;

    @Element(required = false)
    private KeyboardShortcuts keyboardShortcuts;

    @Element(required = false)
    private ListPlacement listPlacement;

    @Element(required = false)
    private WorkspaceMappings workspaceMappings;

    @Override
    public String toString() {
        return "ApplicationsPojo{" +
                "customApplicationComponents=" + customApplicationComponents +
                ", defaultLandingTab='" + defaultLandingTab + '\'' +
                ", description='" + description + '\'' +
                ", formFactors='" + formFactors + '\'' +
                ", label='" + label + '\'' +
                ", logo='" + logo + '\'' +
                ", listRefreshMethod='" + listRefreshMethod + '\'' +
                ", saveUserSessions='" + saveUserSessions + '\'' +
                ", tabs=" + tabs +
                ", uiType='" + uiType + '\'' +
                ", navType='" + navType + '\'' +
                ", setupExperience='" + setupExperience + '\'' +
                ", utilityBar='" + utilityBar + '\'' +
                ", detailPageRefreshMethod='" + detailPageRefreshMethod + '\'' +
                ", enableCustomizeMyTabs=" + enableCustomizeMyTabs +
                ", enableKeyboardShortcuts=" + enableKeyboardShortcuts +
                ", enableListViewHover=" + enableListViewHover +
                ", enableListViewReskin=" + enableListViewReskin +
                ", enableMultiMonitorComponents=" + enableMultiMonitorComponents +
                ", enablePinTabs=" + enablePinTabs +
                ", enableTabHover=" + enableTabHover +
                ", enableTabLimits=" + enableTabLimits +
                ", isServiceCloudConsole=" + isServiceCloudConsole +
                ", keyboardShortcuts=" + keyboardShortcuts +
                ", listPlacement=" + listPlacement +
                ", workspaceMappings=" + workspaceMappings +
                '}';
    }
}

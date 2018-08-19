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

    public CustomApplicationComponents getCustomApplicationComponents() {
        return customApplicationComponents;
    }

    public void setCustomApplicationComponents(CustomApplicationComponents customApplicationComponents) {
        this.customApplicationComponents = customApplicationComponents;
    }

    public String getDefaultLandingTab() {
        return defaultLandingTab;
    }

    public void setDefaultLandingTab(String defaultLandingTab) {
        this.defaultLandingTab = defaultLandingTab;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormFactors() {
        return formFactors;
    }

    public void setFormFactors(String formFactors) {
        this.formFactors = formFactors;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getListRefreshMethod() {
        return listRefreshMethod;
    }

    public void setListRefreshMethod(String listRefreshMethod) {
        this.listRefreshMethod = listRefreshMethod;
    }

    public String getSaveUserSessions() {
        return saveUserSessions;
    }

    public void setSaveUserSessions(String saveUserSessions) {
        this.saveUserSessions = saveUserSessions;
    }

    public List<String> getTabs() {
        return tabs;
    }

    public void setTabs(List<String> tabs) {
        this.tabs = tabs;
    }

    public String getUiType() {
        return uiType;
    }

    public void setUiType(String uiType) {
        this.uiType = uiType;
    }

    public String getNavType() {
        return navType;
    }

    public void setNavType(String navType) {
        this.navType = navType;
    }

    public String getSetupExperience() {
        return setupExperience;
    }

    public void setSetupExperience(String setupExperience) {
        this.setupExperience = setupExperience;
    }

    public String getUtilityBar() {
        return utilityBar;
    }

    public void setUtilityBar(String utilityBar) {
        this.utilityBar = utilityBar;
    }

    public String getDetailPageRefreshMethod() {
        return detailPageRefreshMethod;
    }

    public void setDetailPageRefreshMethod(String detailPageRefreshMethod) {
        this.detailPageRefreshMethod = detailPageRefreshMethod;
    }

    public Boolean getEnableCustomizeMyTabs() {
        return enableCustomizeMyTabs;
    }

    public void setEnableCustomizeMyTabs(Boolean enableCustomizeMyTabs) {
        this.enableCustomizeMyTabs = enableCustomizeMyTabs;
    }

    public Boolean getEnableKeyboardShortcuts() {
        return enableKeyboardShortcuts;
    }

    public void setEnableKeyboardShortcuts(Boolean enableKeyboardShortcuts) {
        this.enableKeyboardShortcuts = enableKeyboardShortcuts;
    }

    public Boolean getEnableListViewHover() {
        return enableListViewHover;
    }

    public void setEnableListViewHover(Boolean enableListViewHover) {
        this.enableListViewHover = enableListViewHover;
    }

    public Boolean getEnableListViewReskin() {
        return enableListViewReskin;
    }

    public void setEnableListViewReskin(Boolean enableListViewReskin) {
        this.enableListViewReskin = enableListViewReskin;
    }

    public Boolean getEnableMultiMonitorComponents() {
        return enableMultiMonitorComponents;
    }

    public void setEnableMultiMonitorComponents(Boolean enableMultiMonitorComponents) {
        this.enableMultiMonitorComponents = enableMultiMonitorComponents;
    }

    public Boolean getEnablePinTabs() {
        return enablePinTabs;
    }

    public void setEnablePinTabs(Boolean enablePinTabs) {
        this.enablePinTabs = enablePinTabs;
    }

    public Boolean getEnableTabHover() {
        return enableTabHover;
    }

    public void setEnableTabHover(Boolean enableTabHover) {
        this.enableTabHover = enableTabHover;
    }

    public Boolean getEnableTabLimits() {
        return enableTabLimits;
    }

    public void setEnableTabLimits(Boolean enableTabLimits) {
        this.enableTabLimits = enableTabLimits;
    }

    public Boolean getServiceCloudConsole() {
        return isServiceCloudConsole;
    }

    public void setServiceCloudConsole(Boolean serviceCloudConsole) {
        isServiceCloudConsole = serviceCloudConsole;
    }

    public KeyboardShortcuts getKeyboardShortcuts() {
        return keyboardShortcuts;
    }

    public void setKeyboardShortcuts(KeyboardShortcuts keyboardShortcuts) {
        this.keyboardShortcuts = keyboardShortcuts;
    }

    public ListPlacement getListPlacement() {
        return listPlacement;
    }

    public void setListPlacement(ListPlacement listPlacement) {
        this.listPlacement = listPlacement;
    }

    public WorkspaceMappings getWorkspaceMappings() {
        return workspaceMappings;
    }

    public void setWorkspaceMappings(WorkspaceMappings workspaceMappings) {
        this.workspaceMappings = workspaceMappings;
    }

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

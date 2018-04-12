package sandbox.oleksii.project.metadata.objects;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;
import sandbox.oleksii.project.metadata.objects.components.*;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="CustomObject")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ObjectsPojo extends XmlPojoEntity {

    @ElementList(required = false, inline = true)
    private List<ActionOverrides> actionOverrides;

    @ElementList(required = false, inline = true)
    private List<BusinessProcesses> businessProcesses;

    @Element(required = false)
    private Boolean enableActivities;

    @Element(required = false)
    private String deploymentStatus;

    @Element(required = false)
    private Boolean deprecated;

    @Element(required = false)
    private Boolean allowInChatterGroups;

    @Element(required = false)
    private String compactLayoutAssignment;

    @Element(required = false)
    private String customSettingsType;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private Boolean enableBulkApi;

    @Element(required = false)
    private Boolean enableChangeDataCapture;

    @Element(required = false)
    private Boolean enableEnhancedLookup;

    @Element(required = false)
    private Boolean enableFeeds;

    @Element(required = false)
    private String externalSharingModel;

    @Element(required = false)
    private Boolean enableHistory;

    @Element(required = false)
    private Boolean enableReports;

    @Element(required = false)
    private Boolean enableSearch;

    @Element(required = false)
    private Boolean enableSharing;

    @Element(required = false)
    private Boolean enableStreamingApi;

    @ElementList(required = false, inline = true)
    private List<FieldSets> fieldSets;

    @ElementList(required = false, inline = true)
    private List<Fields> fields;

    @ElementList(required = false, inline = true)
    private List<ListViews> listViews;

    @Element(required = false)
    private Boolean recordTypeTrackFeedHistory;

    @Element(required = false)
    private Boolean recordTypeTrackHistory;

    @ElementList(required = false, inline = true)
    private List<RecordTypes> recordTypes;

    @Element(required = false)
    private NameField nameField;

    @Element(required = false)
    private String pluralLabel;

    @ElementList(required = false, inline = true)
    private List<SearchLayouts> searchLayouts;

    @Element(required = false)
    private String sharingModel;

    @Element(required = false)
    private String startsWith;

    @Element(required = false)
    private String visibility;

    @ElementList(required = false, inline = true)
    private List<ValidationRules> validationRules;

    @ElementList(required = false, inline = true)
    private List<WebLinks> webLinks;

    @Element(required = false)
    private String label;

    @Element(required = false)
    private String gender;

    @Element(required = false)
    private ArticleTypeChannelDisplay articleTypeChannelDisplay;

    public List<ActionOverrides> getActionOverrides() {
        return actionOverrides;
    }

    public void setActionOverrides(List<ActionOverrides> actionOverrides) {
        this.actionOverrides = actionOverrides;
    }

    public List<BusinessProcesses> getBusinessProcesses() {
        return businessProcesses;
    }

    public void setBusinessProcesses(List<BusinessProcesses> businessProcesses) {
        this.businessProcesses = businessProcesses;
    }

    public Boolean getEnableActivities() {
        return enableActivities;
    }

    public void setEnableActivities(Boolean enableActivities) {
        this.enableActivities = enableActivities;
    }

    public String getDeploymentStatus() {
        return deploymentStatus;
    }

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public Boolean getAllowInChatterGroups() {
        return allowInChatterGroups;
    }

    public void setAllowInChatterGroups(Boolean allowInChatterGroups) {
        this.allowInChatterGroups = allowInChatterGroups;
    }

    public String getCompactLayoutAssignment() {
        return compactLayoutAssignment;
    }

    public void setCompactLayoutAssignment(String compactLayoutAssignment) {
        this.compactLayoutAssignment = compactLayoutAssignment;
    }

    public String getCustomSettingsType() {
        return customSettingsType;
    }

    public void setCustomSettingsType(String customSettingsType) {
        this.customSettingsType = customSettingsType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnableBulkApi() {
        return enableBulkApi;
    }

    public void setEnableBulkApi(Boolean enableBulkApi) {
        this.enableBulkApi = enableBulkApi;
    }

    public Boolean getEnableChangeDataCapture() {
        return enableChangeDataCapture;
    }

    public void setEnableChangeDataCapture(Boolean enableChangeDataCapture) {
        this.enableChangeDataCapture = enableChangeDataCapture;
    }

    public Boolean getEnableEnhancedLookup() {
        return enableEnhancedLookup;
    }

    public void setEnableEnhancedLookup(Boolean enableEnhancedLookup) {
        this.enableEnhancedLookup = enableEnhancedLookup;
    }

    public Boolean getEnableFeeds() {
        return enableFeeds;
    }

    public void setEnableFeeds(Boolean enableFeeds) {
        this.enableFeeds = enableFeeds;
    }

    public String getExternalSharingModel() {
        return externalSharingModel;
    }

    public void setExternalSharingModel(String externalSharingModel) {
        this.externalSharingModel = externalSharingModel;
    }

    public Boolean getEnableHistory() {
        return enableHistory;
    }

    public void setEnableHistory(Boolean enableHistory) {
        this.enableHistory = enableHistory;
    }

    public Boolean getEnableReports() {
        return enableReports;
    }

    public void setEnableReports(Boolean enableReports) {
        this.enableReports = enableReports;
    }

    public Boolean getEnableSearch() {
        return enableSearch;
    }

    public void setEnableSearch(Boolean enableSearch) {
        this.enableSearch = enableSearch;
    }

    public Boolean getEnableSharing() {
        return enableSharing;
    }

    public void setEnableSharing(Boolean enableSharing) {
        this.enableSharing = enableSharing;
    }

    public Boolean getEnableStreamingApi() {
        return enableStreamingApi;
    }

    public void setEnableStreamingApi(Boolean enableStreamingApi) {
        this.enableStreamingApi = enableStreamingApi;
    }

    public List<FieldSets> getFieldSets() {
        return fieldSets;
    }

    public void setFieldSets(List<FieldSets> fieldSets) {
        this.fieldSets = fieldSets;
    }

    public List<Fields> getFields() {
        return fields;
    }

    public void setFields(List<Fields> fields) {
        this.fields = fields;
    }

    public List<ListViews> getListViews() {
        return listViews;
    }

    public void setListViews(List<ListViews> listViews) {
        this.listViews = listViews;
    }

    public Boolean getRecordTypeTrackFeedHistory() {
        return recordTypeTrackFeedHistory;
    }

    public void setRecordTypeTrackFeedHistory(Boolean recordTypeTrackFeedHistory) {
        this.recordTypeTrackFeedHistory = recordTypeTrackFeedHistory;
    }

    public Boolean getRecordTypeTrackHistory() {
        return recordTypeTrackHistory;
    }

    public void setRecordTypeTrackHistory(Boolean recordTypeTrackHistory) {
        this.recordTypeTrackHistory = recordTypeTrackHistory;
    }

    public List<RecordTypes> getRecordTypes() {
        return recordTypes;
    }

    public void setRecordTypes(List<RecordTypes> recordTypes) {
        this.recordTypes = recordTypes;
    }

    public NameField getNameField() {
        return nameField;
    }

    public void setNameField(NameField nameField) {
        this.nameField = nameField;
    }

    public String getPluralLabel() {
        return pluralLabel;
    }

    public void setPluralLabel(String pluralLabel) {
        this.pluralLabel = pluralLabel;
    }

    public List<SearchLayouts> getSearchLayouts() {
        return searchLayouts;
    }

    public void setSearchLayouts(List<SearchLayouts> searchLayouts) {
        this.searchLayouts = searchLayouts;
    }

    public String getSharingModel() {
        return sharingModel;
    }

    public void setSharingModel(String sharingModel) {
        this.sharingModel = sharingModel;
    }

    public String getStartsWith() {
        return startsWith;
    }

    public void setStartsWith(String startsWith) {
        this.startsWith = startsWith;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public List<ValidationRules> getValidationRules() {
        return validationRules;
    }

    public void setValidationRules(List<ValidationRules> validationRules) {
        this.validationRules = validationRules;
    }

    public List<WebLinks> getWebLinks() {
        return webLinks;
    }

    public void setWebLinks(List<WebLinks> webLinks) {
        this.webLinks = webLinks;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArticleTypeChannelDisplay getArticleTypeChannelDisplay() {
        return articleTypeChannelDisplay;
    }

    public void setArticleTypeChannelDisplay(ArticleTypeChannelDisplay articleTypeChannelDisplay) {
        this.articleTypeChannelDisplay = articleTypeChannelDisplay;
    }

    @Override
    public String toString() {
        return "ObjectsPojo{" +
                "actionOverrides=" + actionOverrides +
                ", businessProcesses=" + businessProcesses +
                ", enableActivities=" + enableActivities +
                ", deploymentStatus='" + deploymentStatus + '\'' +
                ", deprecated=" + deprecated +
                ", allowInChatterGroups=" + allowInChatterGroups +
                ", compactLayoutAssignment='" + compactLayoutAssignment + '\'' +
                ", customSettingsType='" + customSettingsType + '\'' +
                ", description='" + description + '\'' +
                ", enableBulkApi=" + enableBulkApi +
                ", enableChangeDataCapture=" + enableChangeDataCapture +
                ", enableEnhancedLookup=" + enableEnhancedLookup +
                ", enableFeeds=" + enableFeeds +
                ", externalSharingModel='" + externalSharingModel + '\'' +
                ", enableHistory=" + enableHistory +
                ", enableReports=" + enableReports +
                ", enableSearch=" + enableSearch +
                ", enableSharing=" + enableSharing +
                ", enableStreamingApi=" + enableStreamingApi +
                ", fieldSets=" + fieldSets +
                ", fields=" + fields +
                ", listViews=" + listViews +
                ", recordTypeTrackFeedHistory=" + recordTypeTrackFeedHistory +
                ", recordTypeTrackHistory=" + recordTypeTrackHistory +
                ", recordTypes=" + recordTypes +
                ", nameField=" + nameField +
                ", pluralLabel='" + pluralLabel + '\'' +
                ", searchLayouts=" + searchLayouts +
                ", sharingModel='" + sharingModel + '\'' +
                ", startsWith='" + startsWith + '\'' +
                ", visibility='" + visibility + '\'' +
                ", validationRules=" + validationRules +
                ", webLinks=" + webLinks +
                ", label='" + label + '\'' +
                ", gender='" + gender + '\'' +
                ", articleTypeChannelDisplay=" + articleTypeChannelDisplay +
                '}';
    }
}

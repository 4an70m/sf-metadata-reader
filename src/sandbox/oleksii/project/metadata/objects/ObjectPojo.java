package sandbox.oleksii.project.metadata.objects;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.objects.components.*;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="CustomObject")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ObjectPojo extends XmlPojoEntity {

    @ElementList(required = false, inline = true)
    private List<ActionOverrides> actionOverrides;

    @ElementList(required = false, inline = true)
    private List<BusinessProcesses> businessProcesses;

    @Element(required = false)
    private Boolean enableActivities;

    @ElementList(required = false, inline = true)
    private List<CompactLayouts> compactLayouts;

    @Element(required = false)
    private String deploymentStatus;

    @Element(required = false, name = "deprecated")
    private Boolean isDeprecated;

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
    private SharingReasons sharingReasons;

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
}
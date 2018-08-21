package sandbox.oleksii.project.metadata.objectTranslations;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.objectTranslations.component.*;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="CustomObjectTranslation")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ObjectTranslationPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "caseValues", required = false)
    private List<CaseValue> caseValues;

    @Element(required = false)
    private String gender;

    @ElementList(inline = true, entry = "fieldSets", required = false)
    private List<FieldSet> fieldSets;

    @ElementList(inline = true, entry = "fields", required = false)
    private List<Field> fields;

    @ElementList(inline = true, entry = "layouts", required = false)
    private List<Layout> layouts;

    @Element(required = false)
    private String nameFieldLabel;

    @ElementList(inline = true, entry = "quickActions", required = false)
    private List<QuickAction> quickActions;

    @ElementList(inline = true, entry = "recordTypes", required = false)
    private List<RecordType> recordTypes;

    @ElementList(inline = true, entry = "sharingReasons", required = false)
    private List<SharingReason> sharingReasons;

    @ElementList(inline = true, entry = "validationRules", required = false)
    private List<ValidationRule> validationRules;

    @Element(required = false)
    private String startsWith;

    @ElementList(inline = true, entry = "webLinks", required = false)
    private List<WebLink> webLinks;

    @ElementList(inline = true, entry = "workflowTasks", required = false)
    private List<WorkflowTask> workflowTasks;
}
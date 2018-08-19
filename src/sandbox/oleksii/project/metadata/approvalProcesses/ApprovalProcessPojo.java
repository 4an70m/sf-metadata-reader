package sandbox.oleksii.project.metadata.approvalProcesses;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.approvalProcesses.components.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="ApprovalProcess")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ApprovalProcessPojo extends XmlPojoEntity {

    @Element
    private Boolean active;

    @Element
    private Boolean allowRecall;

    @ElementList(inline = true, entry = "allowedSubmitters")
    private List<AllowedSubmitter> allowedSubmitters;

    @ElementList(entry = "field")
    private ArrayList<String> approvalPageFields;

    @ElementList(inline = true, entry = "approvalStep")
    private List<ApprovalStep> approvalSteps;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private String emailTemplate;

    @Element
    private Boolean enableMobileDeviceAccess;

    @Element
    private EntryCriteria entryCriteria;

    @ElementList(entry = "action", required = false)
    private ArrayList<Action> finalApprovalActions;

    @Element
    private Boolean finalApprovalRecordLock;

    @ElementList(entry = "action", required = false)
    private ArrayList<Action> finalRejectionActions;

    @Element
    private Boolean finalRejectionRecordLock;

    @ElementList(entry = "action", required = false)
    private ArrayList<Action> initialSubmissionActions;

    @Element
    private String label;

    @Element(required = false)
    private NextAutomatedApprover nextAutomatedApprover;

    @ElementList(entry = "action", required = false)
    private ArrayList<Action> recallActions;

    @Element
    private String recordEditability;

    @Element
    private Boolean showApprovalHistory;

    @Override
    public String toString() {
        return "ApprovalProcessPojo{" +
                "active=" + active +
                ", allowRecall=" + allowRecall +
                ", allowedSubmitters=" + allowedSubmitters +
                ", approvalPageFields=" + approvalPageFields +
                ", approvalSteps=" + approvalSteps +
                ", description='" + description + '\'' +
                ", emailTemplate='" + emailTemplate + '\'' +
                ", enableMobileDeviceAccess=" + enableMobileDeviceAccess +
                ", entryCriteria=" + entryCriteria +
                ", finalApprovalActions=" + finalApprovalActions +
                ", finalApprovalRecordLock=" + finalApprovalRecordLock +
                ", finalRejectionActions=" + finalRejectionActions +
                ", finalRejectionRecordLock=" + finalRejectionRecordLock +
                ", initialSubmissionActions=" + initialSubmissionActions +
                ", label='" + label + '\'' +
                ", nextAutomatedApprover=" + nextAutomatedApprover +
                ", recallActions=" + recallActions +
                ", recordEditability='" + recordEditability + '\'' +
                ", showApprovalHistory=" + showApprovalHistory +
                '}';
    }
}

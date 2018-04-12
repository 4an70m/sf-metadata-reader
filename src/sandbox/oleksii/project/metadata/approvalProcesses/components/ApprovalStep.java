package sandbox.oleksii.project.metadata.approvalProcesses.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;

/**
 * Created by User on 07.01.2018.
 */
public class ApprovalStep {

    @Element
    private Boolean allowDelegate;

    @ElementList(entry = "action", required = false)
    private ArrayList<Action> approvalActions;

    @Element(required = false)
    private AssignedApprover assignedApprover;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private EntryCriteria entryCriteria;

    @Element(required = false)
    private String ifCriteriaNotMet;

    @Element
    private String label;

    @Element
    private String name;

    @Element(required = false)
    private RejectBehavior rejectBehavior;

    @ElementList(required = false, entry = "action")
    private ArrayList<Action> rejectionActions;

}

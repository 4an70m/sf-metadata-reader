package sandbox.oleksii.project.metadata.approvalProcesses.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 07.01.2018.
 */
public class AssignedApprover {

    @ElementList(inline = true, entry = "approver")
    private List<Approver> approvers;

    @Element(required = false)
    private String whenMultipleApprovers;

}

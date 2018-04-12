package sandbox.oleksii.project.metadata.approvalProcesses.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 07.01.2018.
 */
public class NextAutomatedApprover {

    @Element
    private String useApproverFieldOfRecordOwner;

    @Element
    private String userHierarchyField;
}

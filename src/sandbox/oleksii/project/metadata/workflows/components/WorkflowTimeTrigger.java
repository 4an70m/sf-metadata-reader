package sandbox.oleksii.project.metadata.workflows.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 07.01.2018.
 */
public class WorkflowTimeTrigger {

    @ElementList(inline = true, entry = "actions", required = false)
    private List<Action> actions;

    @Element(required = false)
    private String offsetFromField;

    @Element
    private Integer timeLength;

    @Element
    private String workflowTimeTriggerUnit;

}

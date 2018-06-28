package sandbox.oleksii.project.metadata.workflows.components;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 07.01.2018.
 */
public class Rule {

    @Element
    private String fullName;

    @ElementList(inline = true, entry = "actions", required = false)
    private List<Action> actions;

    @Element
    private Boolean active;

    @Element(required = false)
    public String booleanFilter;

    @ElementList(inline = true, entry = "criteriaItems", required = false)
    private List<CriteriaItems> criteriaItems;

    @Element(required = false)
    private String formula;

    @Element(required = false)
    private String description;

    @Element
    private String triggerType;

    @ElementList(inline = true, required = false, entry = "workflowTimeTriggers")
    private List<WorkflowTimeTrigger> workflowTimeTriggers;

}

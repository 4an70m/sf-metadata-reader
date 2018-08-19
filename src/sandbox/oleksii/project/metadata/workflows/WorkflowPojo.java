package sandbox.oleksii.project.metadata.workflows;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.workflows.components.Alert;
import sandbox.oleksii.project.metadata.workflows.components.FieldUpdate;
import sandbox.oleksii.project.metadata.workflows.components.Rule;
import sandbox.oleksii.project.metadata.workflows.components.Task;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="Workflow")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class WorkflowPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "alerts", required = false)
    private List<Alert> alerts;

    @ElementList(inline = true, entry = "fieldUpdates", required = false)
    private List<FieldUpdate> fieldUpdates;

    @ElementList(inline = true, entry = "rules", required = false)
    private List<Rule> rules;

    @ElementList(inline = true, required = false, entry = "tasks")
    private List<Task> tasks;

}

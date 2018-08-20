package sandbox.oleksii.project.metadata.assignmentRules;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.assignmentRules.components.AssignmentRule;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="AssignmentRules")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class AssignmentRulePojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "assignmentRule")
    private List<AssignmentRule> assignmentRules;
}
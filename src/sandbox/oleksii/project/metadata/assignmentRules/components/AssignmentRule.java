package sandbox.oleksii.project.metadata.assignmentRules.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class AssignmentRule {

    @Element
    private String fullName;

    @Element
    private Boolean active;


    @ElementList(inline = true, entry = "ruleEntry", required = false)
    private List<RuleEntry> ruleEntries;

    @Override
    public String toString() {
        return "AssignmentRule{" +
                "fullName='" + fullName + '\'' +
                ", active=" + active +
                ", ruleEntries=" + ruleEntries +
                '}';
    }
}

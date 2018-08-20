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

    @Element(name = "active")
    private Boolean isActive;


    @ElementList(inline = true, entry = "ruleEntry", required = false)
    private List<RuleEntry> ruleEntries;
}
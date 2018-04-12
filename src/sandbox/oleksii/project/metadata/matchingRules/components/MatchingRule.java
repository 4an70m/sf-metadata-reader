package sandbox.oleksii.project.metadata.matchingRules.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 08.01.2018.
 */
public class MatchingRule {

    @Element
    private String fullName;

    @Element(required = false)
    private String description;

    @Element
    private String label;

    @ElementList(inline = true, entry = "matchingRuleItems")
    private List<MatchingRuleItem> matchingRuleItems;

    @Element
    private String ruleStatus;

}

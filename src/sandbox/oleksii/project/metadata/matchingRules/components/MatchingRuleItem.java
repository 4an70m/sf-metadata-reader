package sandbox.oleksii.project.metadata.matchingRules.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 08.01.2018.
 */
public class MatchingRuleItem {

    @Element
    private String blankValueBehavior;

    @Element
    private String fieldName;

    @Element
    private String matchingMethod;

}

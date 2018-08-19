package sandbox.oleksii.project.metadata.duplicateRules.components;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class DuplicateRuleMatchRules {

    @ElementList(inline = true, required = false, entry = "objectMapping")
    private List<ObjectMapping> objectMappings;

    @Attribute(name = "nil", required = false)
    private Boolean isNil;

    @Element
    private String matchRuleSObjectType;

    @Element
    private String matchingRule;
}

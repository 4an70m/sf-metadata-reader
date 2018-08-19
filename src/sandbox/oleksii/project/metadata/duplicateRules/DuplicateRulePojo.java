package sandbox.oleksii.project.metadata.duplicateRules;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.duplicateRules.components.DuplicateRuleFilter;
import sandbox.oleksii.project.metadata.duplicateRules.components.DuplicateRuleMatchRules;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
@Root(name="DuplicateRule")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class DuplicateRulePojo extends XmlPojoEntity {

    @Element
    private String isActive;

    @Element
    private DuplicateRuleFilter duplicateRuleFilter;

    @Element
    private String masterLabel;

    @Element(required = false)
    private String alertText;

    @Element(required = false)
    private String description;

    @Element
    private String sortOrder;

    @ElementList(inline = true, entry = "operationsOnInsert")
    private List<String> operationsOnInsert;

    @ElementList(inline = true, entry = "operationsOnUpdate")
    private List<String> operationsOnUpdate;

    @Element
    private String actionOnInsert;

    @Element
    private String securityOption;

    @Element
    private String actionOnUpdate;

    @Element
    private DuplicateRuleMatchRules duplicateRuleMatchRules;
}
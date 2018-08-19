package sandbox.oleksii.project.metadata.duplicateRules.components;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class DuplicateRuleFilter {

    @Element(required = false)
    private String booleanFilter;

    @Attribute(name = "nil", required = false)
    private Boolean isNil;


    @ElementList(inline = true, entry = "duplicateRuleFilterItems", required = false)
    private List<DuplicateRuleFilterItems> duplicateRuleFilterItems;
}

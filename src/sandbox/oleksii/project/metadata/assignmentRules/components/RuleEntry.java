package sandbox.oleksii.project.metadata.assignmentRules.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class RuleEntry {

    @Element
    private String assignedTo;

    @Element
    private String assignedToType;

    @Element(required = false)
    private String formula;

    @Element(required = false)
    private String booleanFilter;

    @ElementList(inline = true, entry = "criteriaItems", required = false)
    private List<CriteriaItems> criteriaItems;

    @Element(required = false)
    private String template;

}

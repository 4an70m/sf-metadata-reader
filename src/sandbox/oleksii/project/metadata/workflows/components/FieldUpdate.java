package sandbox.oleksii.project.metadata.workflows.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 07.01.2018.
 */
public class FieldUpdate {

    @Element
    private String fullName;

    @Element(required = false)
    private String description;

    @Element
    private String field;

    @Element(required = false)
    private String lookupValue;

    @Element(required = false)
    private String lookupValueType;

    @Element(required = false)
    private String literalValue;

    @Element(required = false)
    private String formula;

    @Element
    private String name;

    @Element
    private Boolean notifyAssignee;

    @Element
    private String operation;

    @Element(name = "protected")
    private Boolean isProtected;

    @Element(required = false, name = "targetObject")
    private Boolean isTargetObject;

    @Element(required = false)
    private Boolean reevaluateOnChange;
}

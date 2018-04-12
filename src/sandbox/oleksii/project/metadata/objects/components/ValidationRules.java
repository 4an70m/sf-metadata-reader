package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 05.01.2018.
 */
public class ValidationRules {

    @Element
    private String fullName;

    @Element
    private Boolean active;

    @Element
    private String errorConditionFormula;

    @Element(required = false)
    private String errorDisplayField;

    @Element
    private String errorMessage;

    @Element(required = false)
    private String description;
}

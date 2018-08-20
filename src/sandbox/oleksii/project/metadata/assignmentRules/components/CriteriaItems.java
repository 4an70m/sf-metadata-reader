package sandbox.oleksii.project.metadata.assignmentRules.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 06.01.2018.
 */
public class CriteriaItems {

    @Element
    private String field;

    @Element
    private String operation;

    @Element
    private String value;
}
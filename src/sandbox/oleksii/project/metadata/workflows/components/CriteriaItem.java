package sandbox.oleksii.project.metadata.workflows.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 06.01.2018.
 */
public class CriteriaItem {

    @Element
    private String field;

    @Element
    private String operation;

    @Element(required = false)
    private String value;

}

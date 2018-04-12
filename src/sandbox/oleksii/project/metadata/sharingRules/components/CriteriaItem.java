package sandbox.oleksii.project.metadata.sharingRules.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 07.01.2018.
 */
public class CriteriaItem {

    @Element(required = false)
    private String field;

    @Element(required = false)
    private String operation;

    @Element(required = false)
    private String value;

}

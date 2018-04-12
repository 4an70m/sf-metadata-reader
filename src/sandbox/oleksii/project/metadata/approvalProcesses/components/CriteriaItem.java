package sandbox.oleksii.project.metadata.approvalProcesses.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 07.01.2018.
 */
public class CriteriaItem {

    @Element
    private String field;

    @Element
    private String operation;

    @Element(required = false)
    private String value;

}

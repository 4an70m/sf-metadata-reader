package sandbox.oleksii.project.metadata.workflows.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 07.01.2018.
 */
public class Recipient {

    @Element(required = false)
    private String recipient;

    @Element(required = false)
    private String field;

    @Element
    private String type;

}

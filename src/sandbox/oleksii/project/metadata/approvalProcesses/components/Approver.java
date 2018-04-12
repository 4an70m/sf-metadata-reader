package sandbox.oleksii.project.metadata.approvalProcesses.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 07.01.2018.
 */
public class Approver {

    @Element(required = false)
    private String name;

    @Element
    private String type;

}

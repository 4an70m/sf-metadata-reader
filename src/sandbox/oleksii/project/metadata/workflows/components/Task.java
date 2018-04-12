package sandbox.oleksii.project.metadata.workflows.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 07.01.2018.
 */
public class Task {

    @Element
    private String fullName;

    @Element
    private String assignedToType;

    @Element
    private String description;

    @Element
    private Integer dueDateOffset;

    @Element
    private Boolean notifyAssignee;

    @Element
    private String priority;

    @Element(name = "protected")
    private String isProtected;

    @Element
    private String status;

    @Element
    private String subject;

}

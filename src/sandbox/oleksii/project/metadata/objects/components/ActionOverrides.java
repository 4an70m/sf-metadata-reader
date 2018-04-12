package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 05.01.2018.
 */
public class ActionOverrides {

    @Element
    private String actionName;

    @Element(required = false)
    private String content;

    @Element(required = false)
    private Boolean skipRecordTypeSelect;

    @Element
    private String type;

    @Element(required = false)
    private String comment;
}

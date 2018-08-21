package sandbox.oleksii.project.metadata.objectTranslations.component;

import org.simpleframework.xml.Element;

/**
 * Created by User on 22.08.2018.
 */
public class WorkflowTask {

    @Element(required = false)
    private String description;

    @Element
    private String name;

    @Element(required = false)
    private String subject;
}

package sandbox.oleksii.project.metadata.emails.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 22.08.2018.
 */
public class Attachment {

    @Element
    private String content;

    @Element
    private String name;
}

package sandbox.oleksii.project.metadata.workflows.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 07.01.2018.
 */
public class Alert {

    @Element
    private String fullName;

    @Element(required = false)
    private String ccEmails;

    @Element(required = false)
    private String description;

    @Element(name = "protected")
    private Boolean isProtected;

    @ElementList(inline = true, entry = "recipients", required = false)
    private List<Recipient> recipients;

    @Element(required = false)
    private String senderAddress;

    @Element
    private String senderType;

    @Element
    private String template;

}

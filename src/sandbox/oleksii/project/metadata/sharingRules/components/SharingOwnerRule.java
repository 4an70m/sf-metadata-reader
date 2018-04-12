package sandbox.oleksii.project.metadata.sharingRules.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 08.01.2018.
 */
public class SharingOwnerRule {

    @Element
    private String fullName;

    @Element
    private String accessLevel;

    @Element(required = false)
    private AccountSettings accountSettings;

    @Element(required = false)
    private String description;

    @Element
    private String label;

    @Element
    private SharedTo sharedTo;

    @Element
    private SharedFrom sharedFrom;


}

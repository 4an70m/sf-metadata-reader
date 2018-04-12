package sandbox.oleksii.project.metadata.sharingRules.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 08.01.2018.
 */
public class AccountSettings {

    @Element
    private String caseAccessLevel;

    @Element
    private String contactAccessLevel;

    @Element
    private String opportunityAccessLevel;

}

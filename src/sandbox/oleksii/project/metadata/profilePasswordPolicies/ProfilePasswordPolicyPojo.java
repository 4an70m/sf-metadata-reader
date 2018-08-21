package sandbox.oleksii.project.metadata.profilePasswordPolicies;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="ProfilePasswordPolicy")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ProfilePasswordPolicyPojo extends XmlPojoEntity {

    @Element
    private Integer lockoutInterval;

    @Element
    private Integer maxLoginAttempts;

    @Element
    private Integer minimumPasswordLength;

    @Element(name = "minimumPasswordLifetime")
    private Boolean isMinimumPasswordLifetime;

    @Element(name = "obscure")
    private Boolean isObscure;

    @Element
    private Integer passwordComplexity;

    @Element
    private Integer passwordExpiration;

    @Element
    private Integer passwordHistory;

    @Element
    private Integer passwordQuestion;

    @Element(required = false)
    private String profile;
}
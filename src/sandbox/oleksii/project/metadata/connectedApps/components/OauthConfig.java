package sandbox.oleksii.project.metadata.connectedApps.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 07.01.2018.
 */
public class OauthConfig {

    @Element
    private String callbackUrl;

    @Element
    private String consumerKey;

    @ElementList(inline = true, entry = "scopes")
    private List<String> scopes;

}

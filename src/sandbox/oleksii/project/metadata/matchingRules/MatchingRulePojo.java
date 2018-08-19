package sandbox.oleksii.project.metadata.matchingRules;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.matchingRules.components.MatchingRule;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="MatchingRules")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class MatchingRulePojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "matchingRules", required = false)
    private List<MatchingRule> matchingRules;

}

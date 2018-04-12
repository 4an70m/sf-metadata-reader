package sandbox.oleksii.project.metadata.sharingRules;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;
import sandbox.oleksii.project.metadata.matchingRules.components.MatchingRule;
import sandbox.oleksii.project.metadata.sharingRules.components.SharingCriteriaRule;
import sandbox.oleksii.project.metadata.sharingRules.components.SharingOwnerRule;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="SharingRules")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class SharingRulesPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "sharingCriteriaRules", required = false)
    private List<SharingCriteriaRule> sharingCriteriaRules;

    @ElementList(inline = true, entry = "sharingOwnerRules", required = false)
    private List<SharingOwnerRule> sharingOwnerRules;
}

package sandbox.oleksii.project.metadata.autoResponseRules;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;
import sandbox.oleksii.project.metadata.autoResponseRules.components.AutoResponseRule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="AutoResponseRules")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class AutoResponseRulesPojo extends XmlPojoEntity {

    @ElementList(inline = true, required = false, entry = "autoResponseRule")
    private List<AutoResponseRule> autoResponseRules;

    @Override
    public String toString() {
        return "AutoResponseRulesPojo{" +
                "autoResponseRules=" + autoResponseRules +
                '}';
    }
}

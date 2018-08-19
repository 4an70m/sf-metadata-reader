package sandbox.oleksii.project.metadata.matchingRules;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.files.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class MatchingRuleMetadata extends XmlMetadata {

    public MatchingRuleMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(MatchingRulePojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

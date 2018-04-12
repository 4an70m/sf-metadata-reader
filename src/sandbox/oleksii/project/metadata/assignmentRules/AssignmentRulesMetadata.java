package sandbox.oleksii.project.metadata.assignmentRules;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import sandbox.oleksii.project.core.XmlMetadata;

/**
 * Created by User on 05.01.2018.
 */
public class AssignmentRulesMetadata extends XmlMetadata {

    public AssignmentRulesMetadata(String fileName) {
        super(fileName);
    }

    @Override
    protected void readXml() {
        Serializer serializer = new Persister();
        try {
            this.entity = serializer.read(AssignmentRulesPojo.class, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

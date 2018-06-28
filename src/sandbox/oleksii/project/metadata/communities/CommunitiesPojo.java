package sandbox.oleksii.project.metadata.communities;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;
import sandbox.oleksii.project.metadata.communities.components.ChatterAnswersReputationLevels;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="Community")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class CommunitiesPojo extends XmlPojoEntity {

    @Element
    private Boolean active;

    @Element
    private Boolean enableChatterAnswers;

    @ElementList(entry = "chatterAnswersReputationLevels")
    private List<ChatterAnswersReputationLevels> reputationLevels;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private String expertsGroup;

    @Element
    private Boolean showInPortal;

}

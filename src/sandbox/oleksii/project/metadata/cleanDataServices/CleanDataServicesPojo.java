package sandbox.oleksii.project.metadata.cleanDataServices;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;
import sandbox.oleksii.project.metadata.cleanDataServices.components.CleanRule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="CleanDataService")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class CleanDataServicesPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "cleanRules")
    private List<CleanRule> cleanRules;

    @Element
    private String description;

    @Element
    private String masterLabel;

    @Element
    private String matchEngine;

}

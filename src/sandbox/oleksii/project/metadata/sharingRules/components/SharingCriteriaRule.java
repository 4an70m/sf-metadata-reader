package sandbox.oleksii.project.metadata.sharingRules.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 08.01.2018.
 */
public class SharingCriteriaRule {

    @Element
    private String fullName;

    @Element
    private String accessLevel;

    @Element(required = false)
    private AccountSettings accountSettings;

    @Element(required = false)
    private String description;

    @Element
    private String label;

    @Element
    private SharedTo sharedTo;

    @Element(required = false)
    private String booleanFilter;

    @ElementList(inline = true, entry = "criteriaItems")
    private List<CriteriaItem> criteriaItems;



}

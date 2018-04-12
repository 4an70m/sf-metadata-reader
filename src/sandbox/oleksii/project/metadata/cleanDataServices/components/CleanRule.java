package sandbox.oleksii.project.metadata.cleanDataServices.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 08.01.2018.
 */
public class CleanRule {

    @Element
    private Boolean bulkEnabled;

    @Element
    private Boolean bypassTriggers;

    @Element
    private Boolean bypassWorkflow;

    @Element
    private String description;

    @Element
    private String developerName;

    @ElementList(inline = true, entry = "fieldMappings")
    private List<FieldMapping> fieldMappings;

    @Element
    private String masterLabel;

    @Element
    private String matchRule;

    @Element
    private String sourceSobjectType;

    @Element
    private String status;

    @Element
    private String targetSobjectType;

}

package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
public class RecordTypes {

    @Element
    private String fullName;

    @Element(name = "active")
    private Boolean isActive;

    @Element(required = false)
    private String businessProcess;

    @Element(required = false)
    private String description;

    @Element
    private String label;

    @ElementList(required = false, inline = true, entry = "picklistValues")
    private List<PicklistValues> picklistValues;

}

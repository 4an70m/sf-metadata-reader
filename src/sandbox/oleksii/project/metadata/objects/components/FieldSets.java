package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class FieldSets {

    @Element
    private String fullName;

    @Element(required = false)
    private String label;

    @Element
    private String description;

    @ElementList(inline = true, entry = "displayedFields")
    private List<DisplayedFields> displayedFields;

}

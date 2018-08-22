package sandbox.oleksii.project.metadata.emails.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 22.08.2018.
 */
public class SharedTo {

    @ElementList(inline = true, entry = "role", required = false)
    private List<String> role;

    @ElementList(inline = true, entry = "group", required = false)
    private List<String> group;

    @ElementList(inline = true, entry = "roleAndSubordinates", required = false)
    private List<String> roleAndSubordinates;

    @ElementList(inline = true, entry = "roleAndSubordinatesInternal", required = false)
    private List<String> roleAndSubordinatesInternal;
}

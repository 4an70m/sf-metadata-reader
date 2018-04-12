package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class SharedTo {

    @ElementList(required = false, inline = true, entry = "role")
    private List<String> role;

    @ElementList(required = false, inline = true, entry = "group")
    private List<String> group;

    @ElementList(required = false, inline = true, entry = "roleAndSubordinatesInternal")
    private List<String> roleAndSubordinatesInternal;

    @ElementList(required = false, inline = true, entry = "roleAndSubordinates")
    private List<String> roleAndSubordinates;

    @Element(required = false)
    private String allInternalUsers;
}

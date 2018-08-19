package sandbox.oleksii.project.metadata.dashboards.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class LeftSection {

    @Element
    private String columnSize;

    @ElementList(inline = true, entry = "components", required = false)
    private List<Component> components;
}

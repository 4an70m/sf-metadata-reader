package sandbox.oleksii.project.metadata.translations.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by 4an70m on 28.06.2018.
 */
public class FlowDefinition {

    @ElementList(inline = true, entry = "flows")
    private List<Flow> flows;

    @Element(required = false)
    private String fullName;
}

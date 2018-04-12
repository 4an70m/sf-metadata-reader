package sandbox.oleksii.project.metadata.applications.components;

import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class WorkspaceMappings {

    @ElementList(inline = true, entry = "mapping")
    private List<Mapping> mappings;

}

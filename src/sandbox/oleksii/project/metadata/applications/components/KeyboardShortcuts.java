package sandbox.oleksii.project.metadata.applications.components;

import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class KeyboardShortcuts {

    @ElementList(inline = true, entry = "defaultShortcut")
    private List<DefaultShortcut> defaultShortcuts;
}

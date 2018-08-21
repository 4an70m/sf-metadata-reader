package sandbox.oleksii.project.metadata.objectTranslations.component;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 22.08.2018.
 */
public class Layout {

    @Element
    private String layout;

    @ElementList(inline = true, entry = "sections")
    private List<Section> sections;
}

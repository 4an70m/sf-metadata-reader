package sandbox.oleksii.project.metadata.translations.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.convert.Convert;

import java.util.List;

/**
 * Created by User on 07.01.2018.
 */
public class LabelTranslation {

    @Element(required = false)
    @Convert(StringEmptyConverter.class)
    private String label;

    @Element
    private String name;

    @Element(required = false)
    @Convert(StringEmptyConverter.class)
    private String description;

    @ElementList(inline = true, required = false, entry = "sections")
    private List<Section> sections;
}
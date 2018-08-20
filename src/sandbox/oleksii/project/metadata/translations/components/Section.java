package sandbox.oleksii.project.metadata.translations.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.convert.Convert;

import java.util.List;

/**
 * Created by User on 07.01.2018.
 */
public class Section {

    @ElementList(inline = true, entry = "columns", required = false)
    private List<LabelTranslation> columns;

    @Element(required = false)
    @Convert(StringEmptyConverter.class)
    private String label;

    @Element
    private String name;
}
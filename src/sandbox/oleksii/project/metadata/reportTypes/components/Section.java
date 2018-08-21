package sandbox.oleksii.project.metadata.reportTypes.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 20.08.2018.
 */
public class Section {

    @Element
    private String masterLabel;

    @ElementList(inline = true, entry = "columns")
    private List<Column> columns;
}
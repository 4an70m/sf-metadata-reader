package sandbox.oleksii.project.metadata.reportTypes.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 20.08.2018.
 */
public class Column {

    @Element
    private String field;

    @Element(name = "checkedByDefault")
    private String isCheckedByDefault;

    @Element
    private String table;
}

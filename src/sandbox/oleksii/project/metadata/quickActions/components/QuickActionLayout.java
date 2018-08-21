package sandbox.oleksii.project.metadata.quickActions.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 21.08.2018.
 */
public class QuickActionLayout {

    @Element
    private String layoutSectionStyle;

    @ElementList(inline = true, entry = "quickActionLayoutColumns")
    private List<QuickActionLayoutColumn> quickActionLayoutColumns;

}

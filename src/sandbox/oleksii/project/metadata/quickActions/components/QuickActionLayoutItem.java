package sandbox.oleksii.project.metadata.quickActions.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 21.08.2018.
 */
public class QuickActionLayoutItem {

    @Element
    private String field;

    @Element(name = "emptySpace")
    private String isEmptySpace;

    @Element
    private String uiBehavior;
}

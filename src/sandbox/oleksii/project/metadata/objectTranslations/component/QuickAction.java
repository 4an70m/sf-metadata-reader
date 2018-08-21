package sandbox.oleksii.project.metadata.objectTranslations.component;

import org.simpleframework.xml.Element;

/**
 * Created by User on 22.08.2018.
 */
public class QuickAction {

    @Element(required = false)
    private String label;

    @Element
    private String name;
}

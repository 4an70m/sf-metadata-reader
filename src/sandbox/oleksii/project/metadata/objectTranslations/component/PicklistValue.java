package sandbox.oleksii.project.metadata.objectTranslations.component;

import org.simpleframework.xml.Element;

/**
 * Created by User on 22.08.2018.
 */
public class PicklistValue {

    @Element
    private String masterLabel;

    @Element(required = false)
    private String translation;
}

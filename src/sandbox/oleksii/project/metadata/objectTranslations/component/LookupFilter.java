package sandbox.oleksii.project.metadata.objectTranslations.component;

import org.simpleframework.xml.Element;

/**
 * Created by User on 22.08.2018.
 */
public class LookupFilter {

    @Element(required = false)
    private String errorMessage;

    @Element(required = false)
    private String informationalMessage;
}

package sandbox.oleksii.project.metadata.objectTranslations.component;

import org.simpleframework.xml.Element;

/**
 * Created by User on 22.08.2018.
 */
public class CaseValue {

    @Element(required = false)
    private String caseType;

    @Element(name = "plural")
    private Boolean isPlural;

    @Element(required = false)
    private String value;
}

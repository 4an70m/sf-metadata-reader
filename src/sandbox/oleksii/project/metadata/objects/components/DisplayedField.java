package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 06.01.2018.
 */
public class DisplayedField {

    @Element
    private String field;

    @Element
    private Boolean isFieldManaged;

    @Element
    private Boolean isRequired;

}

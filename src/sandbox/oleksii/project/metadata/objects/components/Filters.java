package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 06.01.2018.
 */
public class Filters {

    @Element
    private String field;

    @Element
    private String operation;

    @Element(required = false)
    private String value;
}

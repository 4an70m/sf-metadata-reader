package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 06.01.2018.
 */
public class NameField {

    @Element(required = false)
    private String displayFormat;

    @Element
    private String label;

    @Element(required = false)
    private Boolean trackHistory;

    @Element(required = false)
    private Boolean trackFeedHistory;

    @Element
    private String type;

}

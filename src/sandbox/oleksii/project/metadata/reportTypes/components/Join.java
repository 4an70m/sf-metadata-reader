package sandbox.oleksii.project.metadata.reportTypes.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 20.08.2018.
 */
public class Join {

    @Element(required = false)
    private Join join;

    @Element
    private String relationship;

    @Element(name = "outerJoin")
    private String isOuterJoin;

}

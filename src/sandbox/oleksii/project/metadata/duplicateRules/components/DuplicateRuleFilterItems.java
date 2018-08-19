package sandbox.oleksii.project.metadata.duplicateRules.components;

import org.simpleframework.xml.Element;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class DuplicateRuleFilterItems {

    @Element
    private String field;

    @Element
    private String operation;

    @Element
    private String sortOrder;

    @Element(required = false)
    private String value;

    @Element
    private String table;
}

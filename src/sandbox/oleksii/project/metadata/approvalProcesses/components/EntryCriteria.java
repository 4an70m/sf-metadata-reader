package sandbox.oleksii.project.metadata.approvalProcesses.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 07.01.2018.
 */
public class EntryCriteria {

    @Element(required = false)
    private String formula;

    @Element(required = false)
    private String booleanFilter;

    @ElementList(inline = true, entry = "criteriaItems", required = false)
    private List<CriteriaItem> criteriaItem;

}

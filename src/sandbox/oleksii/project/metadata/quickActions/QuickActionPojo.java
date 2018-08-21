package sandbox.oleksii.project.metadata.quickActions;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.quickActions.components.FieldOverride;
import sandbox.oleksii.project.metadata.quickActions.components.QuickActionLayout;

import java.util.List;

/**
 * Created by User on 21.08.2018.
 */
@Root(name="RemoteSiteSetting")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class QuickActionPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "fieldOverrides", required = false)
    private List<FieldOverride> fieldOverrides;

    @Element
    private Boolean optionsCreateFeedItem;

    @Element
    private QuickActionLayout quickActionLayout;

    @Element
    private String standardLabel;

    @Element(required = false)
    private String targetObject;

    @Element(required = false)
    private String targetParentField;

    @Element(required = false)
    private String targetRecordType;

    @Element
    private String type;
}

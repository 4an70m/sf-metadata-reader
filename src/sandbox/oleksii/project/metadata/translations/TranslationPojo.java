package sandbox.oleksii.project.metadata.translations;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.translations.components.FlowDefinitions;
import sandbox.oleksii.project.metadata.translations.components.LabelTranslation;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="Translations")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class TranslationPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "customApplications")
    private List<LabelTranslation> customApplications;

    @ElementList(inline = true, entry = "customLabels")
    private List<LabelTranslation> customLabels;

    @ElementList(inline = true, entry = "customPageWebLinks")
    private List<LabelTranslation> customPageWebLinks;

    @ElementList(inline = true, entry = "customTabs")
    private List<LabelTranslation> customTabs;

    @ElementList(inline = true, entry = "flowDefinitions")
    private List<FlowDefinitions> flowDefinitions;

    @ElementList(inline = true, entry = "quickActions")
    private List<LabelTranslation> quickActions;

    @ElementList(inline = true, entry = "reportTypes")
    private List<LabelTranslation> reportTypes;

    @ElementList(inline = true, entry = "scontrols")
    private List<LabelTranslation> scontrols;
}
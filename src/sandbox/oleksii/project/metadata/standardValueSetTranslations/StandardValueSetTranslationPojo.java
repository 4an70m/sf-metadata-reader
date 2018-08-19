package sandbox.oleksii.project.metadata.standardValueSetTranslations;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.standardValueSetTranslations.components.ValueTranslation;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="StandardValueSetTranslation")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class StandardValueSetTranslationPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "valueTranslation")
    private List<ValueTranslation> valueTranslations;

    @Override
    public String toString() {
        return "StandardValueSetTranslationsPojo{" +
                "valueTranslations=" + valueTranslations +
                '}';
    }
}

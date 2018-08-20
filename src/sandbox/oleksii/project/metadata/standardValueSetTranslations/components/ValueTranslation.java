package sandbox.oleksii.project.metadata.standardValueSetTranslations.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.convert.Convert;

/**
 * Created by User on 07.01.2018.
 */
public class ValueTranslation {

    @Element
    private String masterLabel;

    @Element
    @Convert(StringEmptyConverter.class)
    private String translation;
}
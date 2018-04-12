package sandbox.oleksii.project.metadata.standardValueSetTranslations.components;

import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/**
 * Created by User on 07.01.2018.
 */
public class StringEmptyConverter implements Converter<String> {

    @Override
    public String read(InputNode inputNode) throws Exception {
        String value = inputNode.getValue();
        return value == null ? "" : value;
    }

    @Override
    public void write(OutputNode outputNode, String s) throws Exception {
        outputNode.setValue(s);
    }

}

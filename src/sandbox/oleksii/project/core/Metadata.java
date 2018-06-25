package sandbox.oleksii.project.core;

/**
 * Created by User on 04.01.2018.
 */
public abstract class Metadata extends TextFile {

    public static final String META_XML_EXTENSION = "-meta.xml";

    public Metadata(String pathname) {
        super(pathname);
    }

}

package sandbox.oleksii.project.metadata.pages.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 05.01.2018.
 */
public class PackageVersion {

    @Element
    private String minorNumber;

    @Element
    private String majorNumber;

    @Element
    private String namespace;
}
package sandbox.oleksii.project.metadata.components.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 05.01.2018.
 */
public class PackageVersions {

    @Element
    private String minorNumber;

    @Element
    private String majorNumber;

    @Element
    private String namespace;
}
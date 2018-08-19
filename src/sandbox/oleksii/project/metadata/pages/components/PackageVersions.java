package sandbox.oleksii.project.metadata.pages.components;

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

    @Override
    public String toString() {
        return "PackageVersions{" +
                "minorNumber='" + minorNumber + '\'' +
                ", majorNumber='" + majorNumber + '\'' +
                ", namespace='" + namespace + '\'' +
                '}';
    }
}

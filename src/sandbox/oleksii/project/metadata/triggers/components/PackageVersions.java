package sandbox.oleksii.project.metadata.triggers.components;

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


    public String getMinorNumber() {
        return minorNumber;
    }

    public void setMinorNumber(String minorNumber) {
        this.minorNumber = minorNumber;
    }

    public String getMajorNumber() {
        return majorNumber;
    }

    public void setMajorNumber(String majorNumber) {
        this.majorNumber = majorNumber;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public String toString() {
        return "PackageVersions{" +
                "minorNumber='" + minorNumber + '\'' +
                ", majorNumber='" + majorNumber + '\'' +
                ", namespace='" + namespace + '\'' +
                '}';
    }
}

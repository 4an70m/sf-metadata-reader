package sandbox.oleksii.project.core;

/**
 * Created by User on 05.01.2018.
 */
public abstract class XmlMetadata extends Metadata {

    protected XmlPojoEntity entity;

    public XmlMetadata(String pathname) {
        super(pathname);
        this.readXml();
    }

    protected abstract void readXml();

    public XmlPojoEntity getEntity() {
        return entity;
    }

    @Override
    public void writeToFile() throws Exception {
        this.plainText = this.entity.toXml();
        super.writeToFile();
    }
}

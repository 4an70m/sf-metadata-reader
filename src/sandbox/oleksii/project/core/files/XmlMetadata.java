package sandbox.oleksii.project.core.files;

/**
 * Created by User on 05.01.2018.
 */
public abstract class XmlMetadata extends Metadata {

    protected XmlPojoEntity entity;

    public XmlMetadata(String fileName) {
        super(fileName);
        if (this.exists()) {
            this.readXml();
        }
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

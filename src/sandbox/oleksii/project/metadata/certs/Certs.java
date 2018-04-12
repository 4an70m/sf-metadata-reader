package sandbox.oleksii.project.metadata.certs;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
public class Certs extends Folder {

    public static final String CLASS_EXTENSION = ".crt";

    public Certs(String rootPath) {
        super(rootPath + "/certs");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new CertsMetadata(fileName));
            }
        }
    }

    @Override
    public List<CertsMetadata> getMetadata() {
        return (List<CertsMetadata>) super.getMetadata();
    }
}

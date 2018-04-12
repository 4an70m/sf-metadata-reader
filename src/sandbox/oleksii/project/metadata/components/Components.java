package sandbox.oleksii.project.metadata.components;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Components extends Folder {

    public static final String CLASS_EXTENSION = ".component";

    public Components(String rootPath) {
        super(rootPath + "/components");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ComponentsMetadata(fileName));
            }
        }
    }

    @Override
    public List<ComponentsMetadata> getMetadata() {
        return (List<ComponentsMetadata>) super.getMetadata();
    }
}

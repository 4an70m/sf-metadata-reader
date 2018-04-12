package sandbox.oleksii.project.metadata.triggers;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
public class Triggers extends Folder {

    public static final String CLASS_EXTENSION = ".trigger";

    public Triggers(String rootPath) {
        super(rootPath + "/triggers");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new TriggersMetadata(fileName));
            }
        }
    }

    @Override
    public List<TriggersMetadata> getMetadata() {
        return (List<TriggersMetadata>) super.getMetadata();
    }
}

package sandbox.oleksii.project.metadata.staticResources;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
public class StaticResources extends Folder {

    public static final String CLASS_EXTENSION = ".resource";

    public StaticResources(String rootPath) {
        super(rootPath + "/staticresources");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new StaticResourcesMetadata(fileName));
            }
        }
    }

    @Override
    public List<StaticResourcesMetadata> getMetadata() {
        return (List<StaticResourcesMetadata>) super.getMetadata();
    }
}

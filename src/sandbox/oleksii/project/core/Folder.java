package sandbox.oleksii.project.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public abstract class Folder extends File {

    protected List<Metadata> metadata;

    public Folder(String path) {
        super(path);
        this.metadata = new ArrayList<>();
        readMetadata();
    }

    public List<String> getListOfFilePathes() {
        List<String> result = new ArrayList<>();
        for (File file : this.listFiles()) {
            if (!file.isDirectory()) {
                result.add(file.getAbsolutePath());
            }
        }
        return result;
    }

    public List<String> getListOfFolderPathes() {
        List<String> result = new ArrayList<>();
        for (File file : this.listFiles()) {
            if (file.isDirectory()) {
                result.add(file.getAbsolutePath());
            }
        }
        return result;
    }

    protected abstract void readMetadata();

    public List<? extends Metadata> getMetadata() {
        return metadata;
    }

    protected String getExtension(String path) {
        return path.substring(path.lastIndexOf("."));
    }

}

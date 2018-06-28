package sandbox.oleksii.project.core;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public abstract class Folder extends File {

    protected List<Metadata> metadata;

    public Folder(String path) {
        super(path);
        this.metadata = new ArrayList<>();
        this.readMetadata();
    }

    public List<String> getListOfFilePaths() {
        List<String> result = new ArrayList<>();
        for (File file : this.getListFiles()) {
            if (!file.isDirectory()) {
                result.add(file.getAbsolutePath());
            }
        }
        return result;
    }

    public List<String> getListOfFolderPaths() {
        List<String> result = new ArrayList<>();
        for (File file : this.getListFiles()) {
            if (file.isDirectory()) {
                result.add(file.getAbsolutePath());
            }
        }
        return result;
    }

    public List<File> getListFiles() {
        File[] files = super.listFiles();
        if (files != null) {
            return Arrays.asList(files);
        }
        return new ArrayList<>();
    }

    protected abstract void readMetadata();

    public List<? extends Metadata> getMetadata() {
        return metadata;
    }

    protected String getExtension(String path) {
        return path.substring(path.lastIndexOf("."));
    }

}

package sandbox.oleksii.project.core.folders;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 4an70m on 18.08.2018.
 */
public class Folder extends File {

    public Folder(String path) {
        super(path);
    }

    protected List<String> getListOfFilePaths() {
        List<String> result = new ArrayList<>();
        for (File file : this.getListFiles()) {
            if (!file.isDirectory()) {
                result.add(file.getAbsolutePath());
            }
        }
        return result;
    }

    protected List<String> getListOfFolderPaths() {
        List<String> result = new ArrayList<>();
        for (File file : this.getListFiles()) {
            if (file.isDirectory()) {
                result.add(file.getAbsolutePath());
            }
        }
        return result;
    }

    protected List<File> getListFiles() {
        File[] files = super.listFiles();
        if (files != null) {
            return Arrays.asList(files);
        }
        return new ArrayList<>();
    }

    protected String getExtension(String path) {
        return path.substring(path.lastIndexOf("."));
    }

}

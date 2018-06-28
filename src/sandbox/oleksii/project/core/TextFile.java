package sandbox.oleksii.project.core;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
public class TextFile extends File {

    protected String plainText;

    public TextFile(String pathname) {
        super(pathname);
        if (this.isFile()) {
            this.plainText = this.readFileToPlainText();
        }
    }

    public void writeToFile() throws Exception {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(this))) {
            writer.write(this.plainText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPlainText() {
        return plainText;
    }

    public List<String> getTextAsList() {
        return Arrays.asList(this.plainText.split("\n"));
    }

    private String readFileToPlainText() {
        StringBuilder result = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(this))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                result.append(line).append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

}

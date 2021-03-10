package _16_IO_text_file.exercises.copy_file_text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyFileTextController {
    public static void main(String[] args) throws IOException {
        List<String>list=CopyFileText.readSourceFile();
        for (String string:list) {
            System.out.println(string);
        }
        CopyFileText.writeTargetFile(list);
    }
}

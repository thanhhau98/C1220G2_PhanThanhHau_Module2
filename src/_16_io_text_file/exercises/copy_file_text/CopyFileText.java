package _16_io_text_file.exercises.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static final String FILE_PATH1 ="D:\\CodeGym\\C1220G2_PhanThanhHau_Module2\\src\\_16_IO_text_file\\exercises\\copy_file_text\\SourceFile.txt" ;
    public static final String FILE_PATH2 = "D:\\CodeGym\\C1220G2_PhanThanhHau_Module2\\src\\_16_IO_text_file\\exercises\\copy_file_text\\TargetFile.bin";


    public static List<String> readSourceFile() throws IOException {
        List<String>list=new ArrayList<>();
        BufferedReader buffRead = null;

        File file = new File(FILE_PATH1);
        try {
            FileReader  fileReader = new FileReader(file);
            buffRead = new BufferedReader(fileReader);
            String line ;
            while ((line=buffRead.readLine()) != null){
                list.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            buffRead.close();
        }
        return list;
    }
    public static void writeTargetFile(List<String> list){
        File file = new File(FILE_PATH2);
        BufferedWriter buffWrite = null;
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            buffWrite = new BufferedWriter(fileWriter);
            for (String string:list) {
                buffWrite.write(string);
                buffWrite.newLine();
            }
            buffWrite.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                buffWrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }




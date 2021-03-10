package _16_io_text_file.exercises.optional_read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {

    public static final String FILE_PATH = "D:\\CodeGym\\C1220G2_PhanThanhHau_Module2\\src\\_16_IO_text_file\\exercises\\optional_read_file_csv\\nation_list";

    public static List<String> readNation(){

        List<String>nationList=new ArrayList<>();
        File file = new File(FILE_PATH);
        BufferedReader buffRead=null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            buffRead = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = buffRead.readLine()) !=null) {
                temp = line.split(",");
                nationList.add(temp[temp.length-1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buffRead.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return nationList;
    }
}

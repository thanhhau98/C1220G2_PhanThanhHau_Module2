package _17_io_binary_file_serialization.exercises.optional_copy_file_binary;



import _17_io_binary_file_serialization.exercises.product_manager_save_by_binary_file.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileBinary {

    public static final String SOURCE_PATH = "D:\\CodeGym\\C1220G2_PhanThanhHau_Module2\\src\\_17_io_binary_file_serialization\\exercises\\product_manager_save_by_binary_file\\ProductFile.bin";
    public static final String TARGET_PATH = "D:\\CodeGym\\C1220G2_PhanThanhHau_Module2\\src\\_17_io_binary_file_serialization\\exercises\\optional_copy_file_binary\\TargetFile.bin";

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(SOURCE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList= (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fos = new FileOutputStream(TARGET_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

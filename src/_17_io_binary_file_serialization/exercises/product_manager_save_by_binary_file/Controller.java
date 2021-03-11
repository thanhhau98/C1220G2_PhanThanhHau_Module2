package _17_io_binary_file_serialization.exercises.product_manager_save_by_binary_file;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static final String PRODUCT_FILE_PATH = "D:\\CodeGym\\C1220G2_PhanThanhHau_Module2\\src\\_17_io_binary_file_serialization\\exercises\\product_manager_save_by_binary_file\\ProductFile.bin";

    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        ProductManager productManager = new ProductManager(productList);
        Product product1= new Product(1,"Pen","ThienLong",12.5,2.2);
        Product product2= new Product(40,"PenCil","ThienLong",10.5,2.3);
        Product product3= new Product("PenCil");

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProductFile(PRODUCT_FILE_PATH);
//        productManager.showProductFile(PRODUCT_FILE_PATH);
        productManager.searchProduct(PRODUCT_FILE_PATH,product3);
    }
}

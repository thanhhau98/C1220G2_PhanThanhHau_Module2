package _17_io_binary_file_serialization.exercises.product_manager_save_by_binary_file;

import java.io.*;
import java.util.List;

public class ProductManager {
    List<Product> productList ;

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }
    public void addProductFile(String string){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(string);
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
    public void showProductFile(String string){
        try {
            FileInputStream fis = new FileInputStream(string);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList= (List<Product>)ois.readObject();
            for (Product product:productList) {
                System.out.println(product.toString());
            }
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void searchProduct(String string ,Product product){
        try {
            FileInputStream fis = new FileInputStream(string);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList= (List<Product>)ois.readObject();
            for (Product products:productList) {
                if (products.equals(product)) {
                    System.out.println(products.toString());
                    break;
                }
            }
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    @Override
    public String toString() {
        return "ProductManager{" +
                "productList=" + productList +
                '}';
    }
}

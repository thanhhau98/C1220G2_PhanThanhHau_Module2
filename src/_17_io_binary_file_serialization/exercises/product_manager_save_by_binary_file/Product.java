package _17_io_binary_file_serialization.exercises.product_manager_save_by_binary_file;

import review_oop.oop_java_2.bai_1.Officers;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String manuFacturer;
    private double priceProduct;
    private double Description;

    public Product(int idProduct, String nameProduct, String manuFacturer, double priceProduct, double description) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.manuFacturer = manuFacturer;
        this.priceProduct = priceProduct;
        Description = description;
    }

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManuFacturer() {
        return manuFacturer;
    }

    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public double getDescription() {
        return Description;
    }

    public void setDescription(double description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", manuFacturer='" + manuFacturer + '\'' +
                ", priceProduct=" + priceProduct +
                ", Description=" + Description +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Product)){
            return false;
        }

        Product otherProduct = (Product) obj;
        if(this.nameProduct.equals(otherProduct.nameProduct)){
            return true;
        }
        return false;
    }
}

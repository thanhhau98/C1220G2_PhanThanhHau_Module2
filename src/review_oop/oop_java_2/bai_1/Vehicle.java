package review_oop.oop_java_2.bai_1;

public class Vehicle {
    private String name;
    private double price;
    private int cylinder;

    public Vehicle(String name, int price, int cylinder) {
        this.name = name;
        this.price = price;
        this.cylinder = cylinder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public double calTax(){
        if (this.cylinder<100){
            return 0.01*this.price;
        }
        if (this.cylinder>=100&& this.cylinder<=200){
            return 0.03*this.price;
        }
            return 0.05*this.price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cylinder=" + cylinder +
                '}';
    }
}

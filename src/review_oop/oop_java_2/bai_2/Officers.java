package review_oop.oop_java_2.bai_2;

public class Officers {
    String name;
    String address;
    String gender;
    Integer date;

    public Officers(String name, String address, String gender, Integer date) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.date = date;
    }

    public Officers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Officers{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Officers)){
            return false;
        }

        Officers otherOfficers = (Officers) obj;
        if(this.name.equals(otherOfficers.name)){
            return true;
        }
        return false;
    }

}

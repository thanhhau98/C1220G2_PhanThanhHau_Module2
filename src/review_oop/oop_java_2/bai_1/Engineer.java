package review_oop.oop_java_2.bai_1;

public class Engineer extends Officers {
    String major;

    public Engineer(String name, String address, String gender, Integer date, String major) {
        super(name, address, gender, date);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "major='" + major + '\'' +
                ", name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", date=" + super.getDate() +
                '}';
    }
}


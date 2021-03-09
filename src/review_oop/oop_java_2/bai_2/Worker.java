package review_oop.oop_java_2.bai_2;

public class Worker extends Officers {
    String level;

    public Worker(String name, String address, String gender, Integer date, String level) {
        super(name, address, gender, date);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level='" + level + '\'' +
                ", name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", date=" + super.getDate() +
                '}';
    }
}

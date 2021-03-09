package review_oop.oop_java_2.bai_1;

public class Staff extends Officers {
    String job;

    public Staff(String name, String address, String gender, Integer date, String job) {
        super(name, address, gender, date);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "job='" + job + '\'' +
                ", name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", date=" + super.getDate() +
                '}';
    }
}

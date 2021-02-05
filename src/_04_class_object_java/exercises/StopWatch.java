package _04_class_object_java.exercises;
public class StopWatch {
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;
    public void start() {
        this.startTime = System.nanoTime();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.nanoTime();
        this.running = false;
    }
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.nanoTime() - startTime);
        }
        else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }
    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        s.start();
        double[]array= new double[10000];
        for (int i=0; i<array.length;i++){
            array[i]=Math.random();
        }
        s.stop();
        System.out.println("elapsed time in nanoseconds: " + s.getElapsedTime());
    }
}
//a, Tính thời gian theo mini giây: (10^(-3)s)
//        Trong đối tượng System có phương thức "currentTimeMillis()", ta dùng nó để đánh dấu 1 mốc thời gian tại
//        vị trí đặt câu lệnh. Để tính thời gian chạy xong 1 đoạn lệnh, ta đặt 2 biến để lấy ra 2 mốc
//        thời gian rồi lấy hiệu của chúng là tính được tổng thời gian chạy chương trình.
//        Ví dụ: Chương trình sau sẽ tính thời gian theo mini giây để máy tính sin của 100000 giá trị truyền vào:
//        PHP:
//public class JavaDemoAndroidVn {
//
//    public static void main(String[] args) {
//        //Vd1
//        long start = System.currentTimeMillis();
//        for (int i = 1; i <= 100000; i++) {
//            System.out.println(Math.sin(i));
//        }
//        long end = System.currentTimeMillis();
//        long t = end - start;
//        System.out.println("Tổng thời gian: " + t + " millisecond");
//    }
//}
//b, Tính thời gian theo nano giây (10^(-9)s)
//        Tương tự như trên, chỉ khác là ta sẽ dùng phương thức "nanoTime()" trong đối tượng System thay vì
//        dùng phương thức "currentTimeMillis()"
//
//        2, Lấy thời gian từ hệ thống
//
//        Bạn xem ví dụ sau, sẽ lấy thời gian từ giờ, phút, giây và ngày, tháng, năm từ hệ thống và hiển thị ra bên ngoài:
//        PHP:
//public class JavaDemoAndroidVn {
//
//    public static void main(String[] args) {
//        //Vd2
//
//        //Lay gio he thong
//        Date thoiGian = new Date();
//
//        //Khai bao dinh dang ngay thang
//        SimpleDateFormat dinhDangThoiGian = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy ");
//
//        //parse ngay thang sang dinh dang va chuyen thanh string.
//        String showTime = dinhDangThoiGian.format(thoiGian.getTime());
//
//        System.out.println("" + showTime);
//    }
//}

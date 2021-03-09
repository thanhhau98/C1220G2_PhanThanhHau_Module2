package review_oop.oop_java_2.bai_2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficersManager officersManager = new OfficersManager(new ArrayList<>());
        officersManager.addOfficer(new Officers("dong","danang","nam",1992));
        officersManager.addOfficer(new Officers("hong","danang","nu",1993));

        System.out.println("input name");
        String name = scanner.nextLine();
        Officers searchOfficer = new Officers(name);
        Officers nameOfiicer= officersManager.searchOfficer(searchOfficer);
        System.out.println(nameOfiicer);
        officersManager.showOfficers();
    }
}

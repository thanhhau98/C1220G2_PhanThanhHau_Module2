package review_oop.oop_java_2.bai_1;

import java.util.List;
import java.util.Scanner;

public class OfficersManager {
    Scanner scanner = new Scanner(System.in);
    List <Officers> officersList;

    public OfficersManager(List<Officers> officersList) {
        this.officersList = officersList;
    }

    public List<Officers> getOfficersList() {
        return officersList;
    }

    public void setOfficersList(List<Officers> officersList) {
        this.officersList = officersList;
    }
    public void addOfficer(Officers officers){
        this.officersList.add(officers);
    }
    public Officers searchOfficer(Officers officers) {
        int index = officersList.indexOf(officers);
        if (index == -1) {
            return null;
        } else {
            return officersList.get(index);
        }
    }
    public void showOfficers(){
        for (Officers officer:officersList) {
            System.out.println(officer);
        }
    }

}


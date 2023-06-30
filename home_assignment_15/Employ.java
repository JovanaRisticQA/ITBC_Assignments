package home_assignment_15;

import java.time.Year;

public class Employ {
    String employFirstName;
    String employLastName;
    int employedSince;

    public Employ(){
    }

    public Employ(String firstName, String lastName, int year){
        this.employFirstName = firstName;
        this.employLastName = lastName;
        this.employedSince = year;
    }

    public boolean employedLongerThan10Years(int employedSince){
        int year = Year.now().getValue();
        if(year - employedSince > 10){
            return true;
        } else {
            return false;
        }
    }

}

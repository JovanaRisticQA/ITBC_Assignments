package home_assignment_15;

public class MainEmploy {
    public static void main(String[] args) {

        Employ employ1 = new Employ("Janko", "Jankovic", 1998);

        if (employ1.employedLongerThan10Years(employ1.employedSince)){
            System.out.println(employ1.employFirstName + " " + employ1.employLastName + " has been employed for over 10 years.");
        } else System.out.println(employ1.employFirstName + " " + employ1.employLastName + " has been employed for less than 10 years.");

        Employ employ2 = new Employ("Marija", "Marijanovic", 2008);

        if (employ2.employedLongerThan10Years(employ2.employedSince)){
            System.out.println(employ2.employFirstName + " " + employ2.employLastName + " has been employed for over 10 years.");
        } else {
            System.out.println(employ2.employFirstName + " " + employ2.employLastName + " has been employed for less than 10 years.");
        }

        Employ employ3 = new Employ("Petar", "Petrovic", 2018);

        if (employ3.employedLongerThan10Years(employ3.employedSince)){
            System.out.println(employ3.employFirstName + " " + employ3.employLastName + " has been employed for over 10 years.");
        } else {
            System.out.println(employ3.employFirstName + " " + employ3.employLastName + " has been employed for less than 10 years.");
        }

    }
}

package all_classes;
public class Instructor extends Member {
    private int yearsOfExperience;

    public Instructor(){

    }
    public Instructor(String id, String firstName, String lastName, double height, double weight, int yearsOfExperience) {
        super(id, firstName, lastName, height, weight);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public boolean goalMet(Equipment equipment) {
        return true;
    }

    @Override
    public void showProfile() {
        System.out.println("Instructor:\n" +
                "first and last name: " + memberFirstName + " " + memberLastName +
                ", \nid: " + id +
                ", \nyears of experience: " + yearsOfExperience +
                ", \nheight: " + memberHeight +
                "cm, \nweight: " + memberWeight +
                "kg, \nBMI: " + countBMI());
    }

    @Override
    public String toString() {
        return "Instructor: (" + id + " " + memberFirstName + " " + memberLastName +
                ")\nYears of experience: (" + yearsOfExperience + ")";
    }
}

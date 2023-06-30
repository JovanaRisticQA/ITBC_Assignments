package all_classes;
import java.util.ArrayList;

public class Gym {
    private String gymName;
    private int openingYear;
    private ArrayList<Member> gymMembers;

    public Gym(){

    }

    public Gym(String gymName, int openingYear, ArrayList<Member> gymMembers) {
        this.gymName = gymName;
        this.openingYear = openingYear;
        this.gymMembers = gymMembers;
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public int getOpeningYear() {
        return openingYear;
    }

    public void setOpeningYear(int openingYear) {
        this.openingYear = openingYear;
    }

    public ArrayList<Member> getGymMembers() {
        return gymMembers;
    }

    public void setGymMembers(ArrayList<Member> gymMembers) {
        this.gymMembers = gymMembers;
    }

    public int membersWhoMeetTheGoal(Equipment equipment, ArrayList<Member> allMembers){
        int membersWhoMeetTheGoal = 0;
        for (Member x : allMembers){
            if(x.goalMet(equipment)){
                membersWhoMeetTheGoal++;
            }
        }
        return membersWhoMeetTheGoal;
    }
}
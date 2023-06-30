package all_classes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Equipment equipment1 = new Equipment("Equipment1", "A cool equipment", 60);
        Equipment equipment2 = new Equipment("Equipment2", "Another great equipment", 40);

        RecreationalMember recreationalMember1 = new RecreationalMember("ID-12", "Marko", "Markovic",
                180, 75, 2,50);
        RecreationalMember recreationalMember2 = new RecreationalMember("ID-15", "Janko", "Jankovic",
                160, 65, 12,40);
        RecreationalMember recreationalMember3 = new RecreationalMember("ID-35", "Nikola", "Nikolic",
                195, 110, 32,70);
        RecreationalMember recreationalMember4 = new RecreationalMember("ID-42", "Stefan", "Stefanovic",
                175, 84, 20,35);
        RecreationalMember recreationalMember5 = new RecreationalMember("ID-16", "Jovan", "Jovanovic",
                183, 93, 22,46);
        RecreationalMember recreationalMember6 = new RecreationalMember("ID-18", "Petar", "Petrovic",
                180, 75, 15,50);

        Instructor instructor = new Instructor("ID-1", "Ivan", "Ivanovic",
                192, 100, 8);

        ArrayList<Member> gymMembers = new ArrayList<>();
        gymMembers.add(instructor);
        gymMembers.add(recreationalMember1);
        gymMembers.add(recreationalMember3);
        gymMembers.add(recreationalMember4);
        gymMembers.add(recreationalMember5);

        Gym gym = new Gym("SuperGym", 2014, gymMembers);

        System.out.println(gym.getGymName() + " has a total of " +
                gym.membersWhoMeetTheGoal(equipment2, gymMembers)
        + " members who are successfully meeting their goal on " + equipment2.getEquipment() + ".");

    }
}
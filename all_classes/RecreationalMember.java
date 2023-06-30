package all_classes;
public class RecreationalMember extends Member {
    private int maxNumberOfRepetition;
    private double maxCapacity;

    public RecreationalMember(){

    }
    public RecreationalMember(String id, String firstName, String lastName, double height, double weight,
                              int maxNumberOfRepetition, double maxCapacity) {
        super(id, firstName, lastName, height, weight);
        setMaxNumberOfRepetition(maxNumberOfRepetition);
        setMaxCapacity(maxCapacity);
    }

    public int getMaxNumberOfRepetition() {
        return maxNumberOfRepetition;
    }

    public void setMaxNumberOfRepetition(int maxNumberOfRepetition) {
        if (maxNumberOfRepetition >= 0) {
            this.maxNumberOfRepetition = maxNumberOfRepetition;
        } else {
            System.out.println("Max number of repetition cannot be less than 0!");
        }
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        if (maxCapacity >= 0) {
            this.maxCapacity = maxCapacity;
        } else {
            System.out.println("Max capacity cannot be a negative value!");
        }
    }

    @Override
    public boolean goalMet(Equipment equipment) {
        if (this.maxCapacity >= equipment.getExerciseDifficulty() &&
            this.maxNumberOfRepetition > 3){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void showProfile() {
        System.out.println("Gym member:\n" +
                "full name: " + memberFirstName + " " + memberLastName +
                ", \nid: " + id +
                ", \nheight: " + memberHeight +
                "cm, \nweight: " + memberWeight +
                "kg, \nBMI: " + countBMI() +
                ", \nmax number of repetition: " + maxNumberOfRepetition +
                ", \nmax capacity: " + maxCapacity);
    }

    @Override
    public String toString() {
        return "Gym member: (" + id + " " + memberFirstName + " " + memberLastName +
                ")\nMax capacity: (" + maxCapacity + ")";
    }
}

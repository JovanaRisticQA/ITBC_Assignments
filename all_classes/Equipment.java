package all_classes;
public class Equipment {
    private String equipment;
    private String description;
    private int exerciseDifficulty;

    public Equipment(){

    }

    public Equipment(String equipment, String description, int exerciseDifficulty) {
        this.equipment = equipment;
        this.description = description;
        setExerciseDifficulty(exerciseDifficulty);
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExerciseDifficulty() {
        return exerciseDifficulty;
    }

    public void setExerciseDifficulty(int exerciseDifficulty) {
        if (exerciseDifficulty >= 25 && exerciseDifficulty <= 100) {
            this.exerciseDifficulty = exerciseDifficulty;
        } else {
            System.out.println("Exercise difficulty must be between 25 i 100!");
        }
    }
}
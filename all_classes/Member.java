package all_classes;
public abstract class Member {
    protected String id;
    protected String memberFirstName;
    protected String memberLastName;
    protected double memberHeight;
    protected double memberWeight;

    public Member(){

    }
    public Member(String id, String firstName, String lastName, double height, double weight) {
        this.id = id;
        this.memberFirstName = firstName;
        this.memberLastName = lastName;
        setMemberHeight(height);
        setMemberWeight(weight);
    }

    public String getId() {
        return id;
    }

    public String getMemberFirstName() {
        return memberFirstName;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public double getMemberHeight() {
        return memberHeight;
    }

    public void setMemberHeight(double memberHeight) {
        if (memberHeight > 0) {
            this.memberHeight = memberHeight;
        } else {
            System.out.println("Height cannot be a negative value!");
        }
    }

    public double getMemberWeight() {
        return memberWeight;
    }

    public void setMemberWeight(double memberWeight) {
        if (memberWeight > 0) {
            this.memberWeight = memberWeight;
        } else {
            System.out.println("Weight cannot be a negative value!");
        }
    }

    public abstract void showProfile();

    public abstract boolean goalMet(Equipment equipment);

    public double countBMI(){
        return this.memberWeight/Math.pow((this.memberHeight / 100), 2);
    }
}

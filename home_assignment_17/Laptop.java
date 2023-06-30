package home_assignment_17;

public class Laptop extends Device {
    private String screen;
    private Keyboard keyboard;

    public Laptop(){

    }
    public Laptop(String processors, String ram, String memory, String screen, Keyboard keyboard) {
        super(processors, ram, memory);
        setScreen(screen);
        setKeyboard(keyboard);
    }

    public String getScreen() {
        return screen;
    }
    public void setScreen(String screen) {
        this.screen = screen;
    }
    public Keyboard getKeyboard() {
        return keyboard;
    }
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", screen: " + screen +
                "\", keyboard: " + keyboard;
    }
}
package home_assignment_17;

public class CellPhone extends Device {

    private String camera;
    private Wireless wireless;

    public CellPhone(){

    }
    public CellPhone(String processors, String ram, String memory, String camera, Wireless wireless) {
        super(processors, ram, memory);
        setCamera(camera);
        setWireless(wireless);
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Wireless getWireless() {
        return wireless;
    }

    public void setWireless(Wireless wireless) {
        this.wireless = wireless;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", camera: " + camera +
                ", wireless: " + wireless.toString().replaceAll("_", "");
    }

}
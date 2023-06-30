package home_assignment_17;

import java.util.ArrayList;

public class Assignment1 {
    public static void main(String[] args) {

        Device device1 = new Device("4", "16GB", "512GB");
        Laptop laptop1 = new Laptop("4", "16GB", "512GB", "15.6",
                Keyboard.INTERNATIONAL);
        CellPhone cellPhone1 = new CellPhone("8", "6GB",
                "128GB", "32megapixel", Wireless._5G);

        ArrayList<Device> devices = new ArrayList<>();
        devices.add(device1);
        devices.add(laptop1);
        devices.add(cellPhone1);

        for (Device d : devices) {
            if (d instanceof Laptop){
                System.out.println("Laptop: " + d.toString());
            } else if (d instanceof CellPhone) {
                System.out.println("Cellphone: " + d.toString());
            } else {
                System.out.println("Computer: " + d.toString());
            }
        }
    }
}
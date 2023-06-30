package home_assignment_10;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String username = "MyUsername";
        String password = "123password123";

        System.out.print("Enter username: ");
        String enteredUsername = sc.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = sc.nextLine();

        if(username.equals(enteredUsername) && password.equals(enteredPassword)){
            System.out.println("You logged in successfully!");
        } else {
            System.out.println("Wrong username or password.");
        }

        sc.close();
    }
}

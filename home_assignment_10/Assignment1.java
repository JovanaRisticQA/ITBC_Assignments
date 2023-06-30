package home_assignment_10;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        /*
        1.Preko skenera uneti godinu,
          program treba da izracuna da li je godina prestupna.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }

        sc.close();
    }
}

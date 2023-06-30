package home_assignment_14;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter currency (EUR, USD or GBP): ");
        String currency = sc.nextLine();
        System.out.print("Enter the amount in dinars: ");
        double amountInDinars = sc.nextDouble();

        System.out.println("The amount in " + currency + " is: " + currencyConversion(amountInDinars, currency));

        }

    public static double currencyConversion(double amount, String currency){
        double convertedAmount = 0;
        switch (currency){
            case "EUR":
                convertedAmount = amount / 117.2954;
                break;
            case "USD":
                convertedAmount = amount / 106.1977;
                break;
            case "GBP":
                convertedAmount = amount / 133.8683;
                break;
        }
        return convertedAmount;
    }
}
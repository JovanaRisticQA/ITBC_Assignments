package home_assignment_14;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements will you enter? ");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }

        replaceArrayElements(array);
    }

    public static void replaceArrayElements(int[] array){
        int maxValue = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }

        Arrays.fill(array, maxValue);
        System.out.println(Arrays.toString(array));
    }

}

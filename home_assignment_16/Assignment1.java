package home_assignment_16;
import java.util.ArrayList;

public class Assignment1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfWholeNumbers = new ArrayList<>();
        arrayOfWholeNumbers.add(15);
        arrayOfWholeNumbers.add(58);
        arrayOfWholeNumbers.add(35);
        arrayOfWholeNumbers.add(0);
        arrayOfWholeNumbers.add(18);
        arrayOfWholeNumbers.add(35);
        arrayOfWholeNumbers.add(14);
        arrayOfWholeNumbers.add(15);
        arrayOfWholeNumbers.add(58);
        arrayOfWholeNumbers.add(7);

        System.out.println("Min: " + min(arrayOfWholeNumbers));
        System.out.println("Max: " + max(arrayOfWholeNumbers));
        System.out.println("Sum: " + sum(arrayOfWholeNumbers));
        System.out.println("Avg: " + avg(arrayOfWholeNumbers));
        System.out.println("Distinct: " + distinct(arrayOfWholeNumbers));
    }

    public static int min(ArrayList<Integer> array){
        int min = 0;
        for (int a : array){
            if (a < min){
                min = a;
            }
        }
        return min;
    }

    public static int max(ArrayList<Integer> array){
        int max = 0;
        for (int a : array){
            if (a > max){
                max = a;
            }
        }
        return max;
    }

    public static int sum(ArrayList<Integer> array){
        int sum = 0;
        for (int a : array){
            sum += a;
        }
        return sum;
    }

    public static double avg(ArrayList<Integer> array){
        int sum = 0;
        for (int a : array){
            sum += a;
        }
        return (double) sum / array.size();
    }

    public static ArrayList<Integer> distinct(ArrayList<Integer> array){
        ArrayList<Integer> distinctList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++){
            if (!distinctList.contains(array.get(i))){
                distinctList.add(array.get(i));
            }
        }
        return distinctList;
    }
}
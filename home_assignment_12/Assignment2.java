package home_assignment_12;

public class Assignment2 {
    public static void main(String[] args) {
        /*
            2.Kreirati niz proizvoljne duzine celobrojnih vrednosti
            i pomnoziti poslednji clan sa ukupnim brojem clanova
            (Koristiti .length, ne fiksnu vrednost)
         */

            int[] array = {4, 56, 7, 8, -82, 12, 35, 4, 7, 18};

            int result = 0;
            for(int i = 0; i < array.length; i++){
                    if (i == array.length - 1){
                        result = array[i] * array.length;
                        System.out.println(result);
                    }
            }

    }
}

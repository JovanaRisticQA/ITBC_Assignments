package home_assignment_12;

public class Assignment3 {
    public static void main(String[] args) {
        /*
            3.Kreirati dva niza i prikazati koji niz ima vise clanova
            (Ne morate petlju koristiti vec mozete if statement)
         */

            int[] array1 = {2, 4, 6, 8, 10, 12};
            int[] array2 = {364, 528, - 385, 10243};

            if (array1.length > array2.length){
                System.out.println("Array1 has more members than array2.");
            } else if (array1.length < array2.length) {
                System.out.println("Array2 has more members than array1.");
            } else {
                System.out.println("Array1 and array2 have the same length.");
            }

    }
}

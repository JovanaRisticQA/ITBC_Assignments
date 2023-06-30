package home_assignment_15;

public class MainMovie {
    public static void main(String[] args) {
        Movie film1 = new Movie("Zootopia", "Byron Howard", 2016);
        Movie film2 = new Movie("The Nightmare Before Christmas", "Henry Selick", 1993);

        if (film1.publishingYear > film2.publishingYear){
            System.out.println(film1.movieName + ", directed by " + film1.director + ", is newer than "
                    + film2.movieName + " by " + film2.director + ".");
        } else if (film1.publishingYear < film2.publishingYear){
            System.out.println(film2.movieName + ", directed by " + film2.director + ", is newer than "
                    + film1.movieName + " by " + film1.director + ".");
        } else {
            System.out.println("Both " + film1.movieName + " and " + film2.movieName + " were released in "
                    + film1.publishingYear + ".");
        }

    }
}

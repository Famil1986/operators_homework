package az.turingacademy.laboratory;

import java.util.Scanner;

public class MovieManager {
    public Movie[] movies = new Movie[0];

    public void inputInitialMovies(Scanner scanner) {
        movies = new Movie[3];
        System.out.println("Input 3 movies:");
        for (int i = 0; i < movies.length; i++) {
            scanner.nextLine();
            System.out.print("Enter the name of movie " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter the rating for \"" + name + "\": ");
            double rating = scanner.nextDouble();

            movies[i] = new Movie(name, rating);
        }
        System.out.println("Movies have been added successfully!");
    }


    public void addMoreMovies(Scanner scanner) {
        System.out.print("How many additional movies would you like to add? ");
        int additionalCount = scanner.nextInt();


        Movie[] newMovies = new Movie[movies.length + additionalCount];
        System.arraycopy(movies, 0, newMovies, 0, movies.length); // Copy existing movies


        for (int i = movies.length; i < newMovies.length; i++) {
            scanner.nextLine(); // Clear leftover newline
            System.out.print("Enter the name of movie " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter the rating for \"" + name + "\": ");
            double rating = scanner.nextDouble();

            newMovies[i] = new Movie(name, rating);
        }

        movies = newMovies; // Update movies array
        System.out.println("Additional movies have been added successfully!");
    }


    public void displayMovies() {
        if (movies.length == 0) {
            System.out.println("No movies have been added yet. Please add movies first.");
            return;
        }

        System.out.println("\nMovies and Ratings:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i].name + " - Rating: " + movies[i].rating);
        }
    }


    public void displayStatistics() {
        if (movies.length == 0) {
            System.out.println("No movies have been added yet. Please add movies first.");
            return;
        }

        double totalRating = 0;
        Movie maxRatedMovie = movies[0];
        Movie minRatedMovie = movies[0];


        for (Movie movie : movies) {
            totalRating += movie.rating;

            if (movie.rating > maxRatedMovie.rating) {
                maxRatedMovie = movie;
            }
            if (movie.rating < minRatedMovie.rating) {
                minRatedMovie = movie;
            }
        }

        double averageRating = totalRating / movies.length;

        System.out.println("\nStatistics:");
        System.out.printf("Average Rating: %.2f%n", averageRating);
        System.out.println("Movie with Maximum Rating: " + maxRatedMovie.name + " (" + maxRatedMovie.rating + ")");
        System.out.println("Movie with Minimum Rating: " + minRatedMovie.name + " (" + minRatedMovie.rating + ")");
    }


    public void searchMovie(Scanner scanner) {
        if (movies.length == 0) {
            System.out.println("No movies have been added yet. Please add movies first.");
            return;
        }

        scanner.nextLine();
        System.out.print("Enter the name of the movie to search for: ");
        String searchName = scanner.nextLine();

        for (Movie movie : movies) {
            if (movie.name.equalsIgnoreCase(searchName)) {
                System.out.println("Movie found: " + movie.name + " - Rating: " + movie.rating);
                return;
            }
        }
        System.out.println("Movie not found.");
    }


    public void updateMovieRating(Scanner scanner) {
        if (movies.length == 0) {
            System.out.println("No movies have been added yet. Please add movies first.");
            return;
        }

        scanner.nextLine();
        System.out.print("Enter the name of the movie to update its rating: ");
        String movieName = scanner.nextLine();

        for (Movie movie : movies) {
            if (movie.name.equalsIgnoreCase(movieName)) {
                System.out.print("Enter the new rating for \"" + movie.name + "\": ");
                double newRating = scanner.nextDouble();
                movie.rating = newRating;
                System.out.println("Rating updated successfully!");
                return;
            }
        }

        System.out.println("Movie not found.");
    }


    public void exitProgram() {
        System.out.println("Exiting the program. Goodbye!");
    }
}


/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.apache.commons.math3.optim.InitialGuess;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Theater {
    Integer starsSum = 0;
    String name;
    Double stars = 0.0;
    HashMap<String, Review> theaterReviews = new HashMap<>();
    HashMap<String, Review> movieReviews = new HashMap<>();
    List<String> movies = new ArrayList<>();


    public Theater (String name) throws Exception {

        if (name == null  ) {
            throw new Exception("Theater name is needed when launching new business.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        if (this.movies.size() == 0) {
            return String.format(
                    "Welcome to %s movie theater, we current have no movies yet.",
                    this.name
            );
        }
        return String.format(
                "Welcome to %s movie theater, we current have ",
                this.name
        );
    }

    public void addReview(Review review, String movie) throws Exception {
        HashMap<String, Review> targetMap;

        if (movie == null) {
            targetMap = this.theaterReviews;
            review.theater = this.name;

            targetMap.put(review.author, review);


        }
        else {
            if (!this.movies.contains(movie)){
                throw new Exception("You can NOT add reviews for no existing movies.");
            }
            targetMap = this.movieReviews;
            review.movie = movie;
        }

        if (targetMap.containsKey(review.author)){
            throw new Exception("this author already reviewed the Shop");
        }

        targetMap.put(review.author, review);

        this.starsSum += review.stars;
        Double avg = (double) this.starsSum / targetMap.size();
        this.stars = Math.round(avg*10.0) / 10.0;
    }

//    private Double starCalculator ( Integer sum, HashMap<String, Reviews> reviews, Integer) {
//
//    }



}
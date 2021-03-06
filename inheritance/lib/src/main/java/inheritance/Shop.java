/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.apache.commons.math3.optim.InitialGuess;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shop {
    Integer starsSum = 0;
    String name;
    String desc;
    Double stars = 0.0;
    List<Integer> starCollection = new ArrayList<>();
    String priceCategory;
    HashMap<String, Review> reviews = new HashMap<>();

    public Shop (String name, String desc, Integer priceCategory) throws Exception {
        if (priceCategory < 1 || priceCategory > 4) {
            throw new Exception("Price category need to between 1 to 4 $s");
        }
        if (name == null || priceCategory == null || desc ==null) {
            throw new Exception("Shop name, description and price category are needed when launching new business.");
        }
        this.name = name;
        this.desc = desc;
        this.priceCategory = "$".repeat(priceCategory);
    }

    @Override
    public String toString() {

        return String.format(
                "Welcome to %s, %s, we current have %.1f stars reviews, and price category is %s.",
                this.name, this.desc, this.stars, this.priceCategory
        );
    }

    public void addReview(Review review) throws Exception {
        if (reviews.containsKey(review.author)){
            throw new Exception("this author already reviewed the Shop");
        }
        review.restaurant = this.name;
        reviews.put(review.author, review);
        this.starsSum += review.stars;
        Double avg = (double) this.starsSum / this.reviews.size();
        this.stars = Math.round(avg*10.0) / 10.0;
    }



}
package inheritance;

public class RestaurantReview extends Review {
    String restaurant;

    public RestaurantReview(String body, String author, Integer stars) throws Exception {

        super(body, author, stars);


    }
}

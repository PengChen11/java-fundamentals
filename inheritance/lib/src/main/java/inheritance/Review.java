package inheritance;

public class Review {

    String body;
    String author;
    Integer stars;
    String restaurant;

    public Review (String body, String author, Integer stars) throws Exception{
        if (body == null || author == null || stars == null){
            throw new Exception("Review body, author and stars are all needed when creating a review.");
        }
        if (stars < 1 || stars > 5) {
            throw new Exception("You can only submit 1 to 5 stars reviews.");
        }
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    @Override
    public String toString(){
        if (restaurant == null) {
            return String.format(
                    "Author: %s, Stars: %d, review: %s",
                    this.author, this.stars, this.body
            );
        }
        return String.format(
                "Restaurant: %s, Author: %s, Stars: %d, review: %s",
                this.restaurant, this.author, this.stars, this.body);
    }
}

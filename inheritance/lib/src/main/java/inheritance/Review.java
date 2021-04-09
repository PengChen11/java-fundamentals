package inheritance;

public class Review {

    String body;
    String author;
    Integer stars;
    String restaurant;
    String theater;
    String movie;
    String shop;

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
        if (this.restaurant != null) {
            return String.format(
                    "This review is for %s restaurant, from author: %s, with %d stars. Review content: %s.",
                    this.restaurant, this.author, this.stars, this.body);
        }

        if (this.shop != null) {
            return String.format(
                    "This review is for %s shop,from author: %s, with %d stars. Review content: %s.",
                    this.shop, this.author, this.stars, this.body
            );
        }

        if (this.theater != null) {
            return String.format(
                    "This review is for %s theater,from author: %s, with %d stars. Review content: %s.",
                    this.theater, this.author, this.stars, this.body
            );
        }



        return String.format(
                "Author: %s, Stars: %d, review: %s.",
                this.author, this.stars, this.body
            );
    }
}

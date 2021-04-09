package inheritance;

public class MovieReview extends Review{
    String movie;

    public MovieReview(String body, String author, Integer stars, String movie) throws Exception {
        super(body, author, stars);
        if (movie == null){
            throw new Exception("Please include the movie's name for review");
        }
        this.movie = movie;
    }

    @Override
    public String toString(){
        return String.format(
                "This review is for %s movie,from author: %s, with %d stars. Review content: %s.",
                this.movie, this.author, this.stars, this.body
        );
    }
}

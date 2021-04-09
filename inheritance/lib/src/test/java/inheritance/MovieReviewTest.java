package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieReviewTest {

    @Test
    public void testReviewInitExceptions(){
        Throwable exception1 = assertThrows(Exception.class, () -> new MovieReview("test",null, null, null ));
        assertEquals("Review body, author and stars are all needed when creating a review.", exception1.getMessage());

        Throwable exception2 = assertThrows(Exception.class, () -> new MovieReview("body", "test", 6, "love story"));
        assertEquals("You can only submit 1 to 5 stars reviews.", exception2.getMessage());
    }

    @Test public void testReivewToString() throws Exception {
        Review test = new MovieReview("body", "test author", 5, "love story");
        String expected = "This review is for love story movie,from author: test author, with 5 stars. Review content: body.";
        String actual = test.toString();
        assertEquals("Review should output proper string", expected, actual);
    }
}
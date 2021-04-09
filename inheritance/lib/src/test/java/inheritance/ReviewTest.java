package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test public void testReviewInitExceptions(){
        Throwable exception1 = assertThrows(Exception.class, () -> new Review("test",null, null ));
        assertEquals("Review body, author and stars are all needed when creating a review.", exception1.getMessage());

        Throwable exception2 = assertThrows(Exception.class, () -> new Review("body", "test", 6));
        assertEquals("You can only submit 1 to 5 stars reviews.", exception2.getMessage());
    }

    @Test public void testReivewToString() throws Exception {
        Review test = new Review("body", "test author", 5);
        String expected = "Author: test author, Stars: 5, review: body";
        String actual = test.toString();
        assertEquals("Review should output proper string", expected, actual);
    }

    @Test public void testReviewKnowsItsKind() throws Exception {
        Review testRestaurant = new Review("body", "test author", 5);
        testRestaurant.restaurant = "aaa restaurant";
        String expected = "This review is for aaa restaurant restaurant, from author: test author, with 5 stars. Review content: body.";
        String actual = testRestaurant.toString();
        assertEquals("Review should output proper string", expected, actual);

        Review testShop = new Review("body", "test author", 5);
        testShop.shop = "bbb shop";
        String expectedShop = "This review is for bbb shop shop,from author: test author, with 5 stars. Review content: body.";
        assertEquals("Review should output proper string", expectedShop, testShop.toString());

        Review testTheater = new Review("body", "test author", 5);
        testTheater.theater = "ccc theater";
        String expectedTheater = "This review is for ccc theater theater,from author: test author, with 5 stars. " +
                "Review" +
                " content: body.";
        assertEquals("Review should output proper string", expectedTheater, testTheater.toString());

        Review testMovie = new Review("body", "test author", 5);
        testMovie.movie = "some name";
        String expectedMovie = "This review is for some name movie,from author: test author, with 5 stars. " +
                "Review" +
                " content: body.";
        assertEquals("Review should output proper string", expectedMovie, testMovie.toString());
    }
}

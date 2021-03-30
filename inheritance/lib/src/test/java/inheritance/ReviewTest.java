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
}

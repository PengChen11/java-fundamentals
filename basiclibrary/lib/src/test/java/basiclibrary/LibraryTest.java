/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test public void testRollResultLength(){
        int expectedNum = 7;
        int actualNum = Library.roll(7).length;
        assertEquals("The length of dice roll should match the required qty", expectedNum, actualNum);
    }

    @Test public void testRollResultRange(){
        int[] result = Library.roll(10);
        boolean everyResultIsInRange = true;
        for ( int dice : result) {
            if ( dice > 6 || dice < 1) everyResultIsInRange = false;
        }
        assertTrue("every single dice is in range, between 1 to 6", everyResultIsInRange);
    }

    @Test public void testContainsDuplicates (){
        int[] testArr = {1,2,3,4,5,6};
        boolean testResult = Library.containsDuplicates(testArr);
        assertFalse("When giving value array with no duplications, return false", testResult);
    }

    @Test public void testContainsDuplicates2 (){
        int[] testArr = {1,2,3,4,5,1};
        boolean testResult = Library.containsDuplicates(testArr);
        assertTrue("When giving value array with duplications, return true", testResult);
    }

    @Test public void testCalculateAverages (){
        int[] testArr = {1,2,3,4,5,6,7};
        double expected = 4;
        double testResult = Library.calculateAverages(testArr);
        assertEquals("When giving value array with duplications, return true", expected,testResult, 0.1 );
    }

    @Test public void testGetLowestAvgArr (){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] expected = {55, 54, 60, 53, 59, 57, 61};
        int[] testResult = Library.getLowestAvgArr(weeklyMonthTemperatures);
        assertArrayEquals("would find the array of lowest average", expected,testResult);
    }

    @Test public void testAnalyzeWeatherData (){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String result = Library.analyzeWeatherData(weeklyMonthTemperatures);
        String newLine = System.getProperty("line.separator");
        String expected = "High: 72"
                        + newLine
                        +"Low: 51"
                        + newLine
                        +"Never saw temperature: 63"
                        + newLine
                        +"Never saw temperature: 67"
                        + newLine
                        +"Never saw temperature: 68"
                        + newLine
                        +"Never saw temperature: 69";
        assertEquals("String should be the same", expected, result);
    }

    @Test public void testTally (){
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String result = Library.tally(votes);
        String expected = "Bush";
        assertEquals("result should be Bush", expected, result);
    }
}

package basic;
import java.util.Random;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import java.util.Timer;
import java.util.TimerTask;



public class Main {
  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(5);

    clock();
  }

  // Function that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

  public static String pluralize ( String str, int qty) {
    return qty > 1 || qty==0 ? str + "s" : str;
  }

  // Function that that accepts an integer n and flips coins until n heads are flipped in a row.
  public static void flipNHeads (int n){
    Random rand = new Random(); //instance of random class
    
    int headsCount=0;
    int flips=0;

    while (headsCount < n){
      float float_random=rand.nextFloat();
      if (float_random < 0.5) {
        System.out.println("tails");
      } else {
        System.out.println("heads");
        headsCount++;
      }
      flips++;
    }
    System.out.println(String.format("It took %d flips to flip %s heads in a row.", flips, n));
  }

  // the clock function
  public static void clock () {
    Timer timer = new Timer(); 
    TimerTask printTime = new PrintTime();
    timer.schedule(printTime, 0, 1000);
  }
}

class PrintTime extends TimerTask { 
  public void run() { 
    LocalDateTime now = LocalDateTime.now();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    System.out.println(time);
  } 
} 
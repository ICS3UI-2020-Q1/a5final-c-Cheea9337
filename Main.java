import java.util.Scanner;
/**
 *
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a beginning number
    System.out.println("What number do you want to begin counting from?");
    int startNumber = input.nextInt();

    // ask the user for an ending number
    System.out.println("What number do you want to end counting at?");
    int endNumber = input.nextInt();

    // find out if the number is odd or even
      if(startNumber % 2 == 0){
      
    // create a for loop to count up to the number
    for(int count = startNumber; count <= endNumber; count = count + 2){
      // print out the numbers counting
      System.out.println(count);
    }
      }else if(startNumber % 2 != 0){
        // add one to the start number to make the number even
        startNumber = startNumber + 1;
        // create a second for loop to count up
        for(int count2 = startNumber; count2 <= endNumber;count2 = count2 + 2){
          // print out the numbers
          System.out.println(count2);
        }
      }
  }
}

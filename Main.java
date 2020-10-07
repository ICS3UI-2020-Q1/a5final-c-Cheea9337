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

    // create a for loop to count up to the number
    for(int count = startNumber; count <= endNumber; count = count + 2){
      // print out the numbers counting
      System.out.println(count);
    }
    
  }
}

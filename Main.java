import java.util.Scanner;
/**
 * gives the sum of 1 to the user's number
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // declare the variable
    int userNum;
    do{
      System.out.println("Please enter an integer to count down to");
      userNum = input.nextInt();
    }while(userNum <= 0);

    int sum = 0;
    
 // create a variable to keep track of the number
    int count = 1;
    // using a loop to count up to number
    while(count <= userNum){
      // add the numbers
      sum = sum + count;
      // increase the value of count by one
      count = count + 1;

    }while(sum <= userNum);
    System.out.println("The sum from 1 to " + userNum + " is " + sum);


  }
}

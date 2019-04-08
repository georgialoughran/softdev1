/*
Program Name: BigNumber.java

Variables/Types: int number

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class BigNumber{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    //Declare variables/types
	int number = 0;
    //Add code here for Inputs, if/else statements, while loops
    System.out.print("Enter a number: ");
		number = input.nextInt();
		if(number > 1_000_000){
			System.out.println(" That is a big number.");
		}

  }
}
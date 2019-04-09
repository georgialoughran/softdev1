/*
Program Name:ForLoop

Variables/Types: List variables and types here

Inputs: yes

If/else statements: yes

Loops: yes

Loop how many times: fixed 10
*/

//uncomment next line if input required
import java.util.Scanner;

public class ForLoop{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    //Declare variables/types
    int number = 0;
    int total = 0;

    //Add code here for Inputs, if/else statements, while loops
    for(int i = 1; i <= 10; i++){
		System.out.print("Enter number "+(i)+": ");
		number = input.nextInt();
		if(number%2!=0){
			//odd number
			total = total + number;
		}
	}

	System.out.print("Sum of odd numbers is" + total);





  }
}
/*1
Program Name:Two

Variables/Types: int num1, num2

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Two{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    //Declare variables/types
    int num1 = 0;
    int num2 = 0;
    //Add code here for Inputs, if/else statements, while loops
    System.out.println("Enter number 1:");
	  	num1=input.nextInt();
	 System.out.println("Enter number 2:");
	   	num2=input.nextInt();

	if(num1==2&&num2==2){
		System.out.println("both numbers are equal to 2");
	}else if(num1==2||num2==2){
		System.out.println("one of the numbers are equal to 2");
		if(num1==2){
			System.out.println("number one is equal to 2");
		}else {
			System.out.println("number two is equal to 2");
		}

	}else {
		System.out.println("Neither number is equal to 2");
	}

  }
}
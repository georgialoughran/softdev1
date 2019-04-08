
/*
Program Name:Number.java

Variables/Types: int number

Inputs: yes

If/else statements: yes

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Number{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    //Declare variables/types
    int number;
    //Add code here for Inputs, if/else statements, while loops
    System.out.println ("Enter a number:");
    number=input.nextInt();
    if (number>0){
		System.out.println ("Its a positive number");
	}else if (number<0){
	   System.out.println ("Its a negative number");
	}else {
		System.out.println ("zero");
	}

  }
}
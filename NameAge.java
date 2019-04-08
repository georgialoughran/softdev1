
/*
Program Name:

Variables/Types: List variables and types here

Inputs: yes

If/else statements: no

Loops: yes

Loop how many times: fixed
*/

//uncomment next line if input required
import java.util.Scanner;

public class NameAge{
  public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);

    //Declare variables/types
    String name = "";
    int age = 0;
    //Add code here for Inputs, if/else statements, while loops
    System.out.println("Enter a name");
    name = input.nextLine();
     System.out.println("Enter an age");
     age = input.nextInt();

    int count = 1;
    while(count <= age){
		System.out.println(name);
		count = count + 1;
		}









  }
}
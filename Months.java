/*
Program Name: Months

Variables/Types: 

Inputs: yes

If/else statements: no

Loops: no

Loop how many times: not applicable
*/

//uncomment next line if input required
import java.util.Scanner;

public class Months{
	public static void main(String[] args){

    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
    
    //Declare variables/types
    //Add code here for Inputs, if/else statements, while loops
    String[] array= {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "Sepember" , "October" , "November" ,                                 "December"};

		String searchStr = "r";
		Boolean found = false;

		for(int i = 0; i < array.length; i++){
			if(array[i].contains(searchStr)){
				System.out.println(array[i]);
			}
		}

		Index.main(null);
    
  }
}



import java.util.*;  //imports the scanner and all the classes within java.util folder
import java.io.*;  //imports the file class and all the classes in java.io folder


public class ScannerReadFIleExample
{


    public static void main(String[] args) throws IOException //must throw exception if file is not found
    {

    	Scanner s = new Scanner (new File("math.dat")); //reads in math.dat file


    	/* nextInt() - reads in an integer (whole number not decimal)
    	 *nextDouble()- reads in a double (decimla)
    	 *nextLine() - reads in a String (text)
    	 *
    	 *math.dat
    	 *
		 			4
					+ 5 3
					- 10 5
					* 200 - 10
					/ 6 3
    	 *
    	 *
    	 */


    	int numOfLines = s.nextInt();  //reads inthe value of 4 in the data set

    	for (int i=0; i < numOfLines; i++)
    	{

    		//all data processing goes here. read a line of data, process it, then output it.
    		///first goal is to read in the data

    		String operator = s.next(); //must use .equals("text") to check strings . if (variable.equals("text"))

    		int firstNum = s.nextInt();
    		int secondNum = s.nextInt();

    		//solve the problem


    		 //then output.

			System.out.println(operator);
    		System.out.println(firstNum);
			System.out.println(secondNum);

	  	} //end for loop
	} //end main

}

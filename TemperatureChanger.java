/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*
*  @author Duncan Khosla
*  @version 28 September, 2014
**/

import java.util.Scanner;

public class TemperatureChanger {

  public static void main (String[] args) {
	double x;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number followed by a F or C");
    // TODO - scan for input in the format 175F or 18C
	String str = scan.next(); 
	if(str.substring(str.length()-1,str.length()).equals( "F"))
	{
		x = Double.parseDouble(str.substring(0,str.length()-1));
		System.out.print(x + "˚ Farenheit is ");
		double z = x;
		x = x-32;
		double y = (double) 5/9;
		x = x*y;
		System.out.print(x);
		System.out.println("˚ Celsius");
	}
	else if(str.substring(str.length()-1,str.length()).equals( "C"))
	{
		x = Double.parseDouble(str.substring(0,str.length()-1));
                System.out.print(x + "˚ Celsius is ");
                double z = x;
                x =(double)( x*9/5+32);
                double y = (double) 9/5;
		x =(double)( x*(9/5)+32);
               System.out.print(z*y+32);
                System.out.print("˚ Farenheit");
	
        }

	else{
		System.out.println("error");
	}
    // TODO - perform correct conversion
    // TODO - print out results to the screen
  }
  
}



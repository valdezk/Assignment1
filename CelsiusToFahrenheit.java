//Purpose : This program demonstrates how to convert celsius to fahrenheit.
//Programmer : Kyle Valdez
//Date : August 28,2019

import java.util.Scanner;

public class CelsiusToFahrenheit
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner (System.in);

		System.out.print("Enter a value in celsius :");

		double celsius = keyboard.nextDouble();

		double fahrenheit = (celsius * 9/5) + 32;

		System.out.println (celsius + "degrees celsius is equivalent to " +
									fahrenheit + " degrees fahrenheit ");

	}


}

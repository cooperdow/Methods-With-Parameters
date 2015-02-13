import java.util.Scanner;
public class Height 
{
	public static void main(String[] args) 
	{
	int feet= inputFeet();
	double inches= inputInches();
	double FAI = combine(feet,inches);
	double centi= centimeters(FAI);
	double meterr=meters(centi);
	double fut=foot(meterr);
	double ench=inch(fut);
	double dev=standardDeviation(ench,FAI);
	}
	public static int inputFeet()
	{
	Scanner userInput = new Scanner(System.in);
	System.out.println("How many feet tall are you?");
	return userInput.nextInt();	
	}
	public static double inputInches()
	{
	Scanner userInput = new Scanner(System.in);
	System.out.println("How many inches tall (in additon to feet previously input) are you?");
	return userInput.nextDouble();
	}
	public static double combine(double numberOfFeet,double numberOfInches)
	{
	double combine= (numberOfFeet*12 + numberOfInches);
	System.out.println("You are " + (numberOfFeet*12 + numberOfInches) + " inches tall");
	return combine;
	}
	public static double centimeters(double combine)
	{
	double centi=(combine*2.54);
	System.out.println("You are " +  (combine*2.54) + " centimeters tall");
	return centi;
	}
	public static double meters(double centimeters)
	{
	double meterrs=(centimeters*.01);
	System.out.println("You are " + (centimeters*.01) + " meters tall");
	return meterrs;
	}
	public static double foot(double meters)
	{
	double fut=(meters*3.28084);
	System.out.println("You are " + (meters*3.28084) + " feet tall");
	return fut;
	}
	public static double inch(double foot)
	{
	double ench=(foot*12);
	System.out.println("You are " + (foot*12) + " inches tall");
	return ench;
	}
	public static double standardDeviation(double inch, double combine)
	{
	double dev=((inch-combine)/(combine)*100);
	System.out.println("The percent deviation is: " + dev);
	return dev;
	}
}

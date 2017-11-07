import java.util.Scanner;

public class US02
{

	public static void main (String[]args)
	{
		float bmi = 0;

		Scanner i = new Scanner (System.in);
		System.out.println("\n\n\n-----------------------------------------------------------------------------------------------------------------------------\n			COOKIFY\n\n\n");
		System.out.println("Enter your Height in meters : ");
		float height = i.nextFloat();
		System.out.println("Enter your weight in kilos");
		float weight = i.nextFloat();
		bmi = weight / (height*height);
		System.out.println("\nyour bmi is : "+ bmi);

		if (bmi < 16.5)
		{
			System.out.println("You're about to die, eat something");
		}
		if (16.5 < bmi && bmi < 18.5)
		{
			System.out.println("You're Thin you should try to gain some weight");
		}
		if (18.5 < bmi && bmi < 25)
		{
			System.out.println("You're pretty much normal no problem");
		}
		if (25 < bmi && bmi < 30)
			System.out.println("You're a bit too big be carefull your bmi says you're overweight");
		if (30 < bmi && bmi < 35)
		{	
			System.out.println("You're a fatass go to the gym ! Moderate obesity is dangerous for your health");
		}
		if (35 < bmi && bmi < 40)
		{
			System.out.println("You're in severe obesity contact a nutritionist asap");
		}
		if (bmi > 40)
			{
			System.out.println("You're in morbid obesity contact a nutritionist asap");
			}
	}
}
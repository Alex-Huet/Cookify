
public class US01
{
	static int volumeEau = 33;
	static int sachetDeThe = 1;
	static int totalIngredient = 0;
	static String the = "thé";
	static String eau = "eau";
	
// Cette fonction affiche une recette pour cookify
	public static void main (String[]args)
	{
		 totalIngredient = totalIngredient + 1;
		 totalIngredient++;
		 System.out.println("\n\n\n-----------------------------------------------------------------------------------------------------------------------------\n			COOKIFY\n\n\n");
		 System.out.println("	Recipe : how to do an epic Tea of the doom \n 	Total Ingredients : " + totalIngredient);

		 System.out.println("\n\n*Sachet de " + the + "					x" + sachetDeThe);
		 System.out.print("*" + eau + "	  	  				x" + volumeEau + "cl\n\n");
		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n			PREPARATION");
		 System.out.print("Faire chauffer l'eau à une température comprise entre 60° et 70°\npuis la verser dans un récipient");
		 System.out.println(" prévu à cet éffet\n\nDéposer le sachet de thé dans l'eau pendant 5min\n");
		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

	}

}
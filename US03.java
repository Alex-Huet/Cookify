import java.util.Scanner;


public class US03
{
	//use array to product names,qtties and the price for each ingredient
	//initialize the array with the choosen recipe
	//use a loop to iterate over the array and print ingredient prices
	//use int counter in order to calculate the total cost of the recipe


	public static void main (String[]args)
	{
		String [] ingredientList = {"thé            " , "Cl d'eau       ","huile de coude "}; // Initialisation de mes tableaux
		float [] quantitiesList = {2,30,1};
		float [] priceList = {0.1f,0.05f,0f};
		int totalIngredient = ingredientList.length;
		float resultat = 0;
		float prixFinal = 0;

		System.out.println("\n\n\n-----------------------------------------------------------------------------------------------------------------------------\n								COOKIFY\n\n"); //Affichage
		System.out.println("Time : 8min");
		System.out.println("Complexity : Easy");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n");


		System.out.println("Shopping list (total ingredient) : "+totalIngredient); // boucle pour afficher le contenu du tableau ingredient et calculer le prix
		for(int i = 0; i < ingredientList.length;i++)

		{
			resultat = priceList[i] * quantitiesList[i]; // calcul du prix d'un ingredient en fonction de sa quantité
			prixFinal = prixFinal + resultat; // calcul du prix total
			System.out.print("*" + ingredientList[i] + "					x" + quantitiesList[i] + "				 Unit Price    "  + priceList[i] + "€" + "	Total "+ priceList[i] * quantitiesList[i] + " €\n" );

		}

		System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n\n		 			 		* TOTAL PRICE * :" + prixFinal + "€");
	}

}
import java.util.Scanner;


public class US05
{


	public static void main (String[]args)
	{

		{
		int boucle = 1;
		while(boucle == 1)
	{ 
			
	int response = 1; // variable utilisé pour les boucles

	/************************** 		Affichage du menu 		****************************/	
	while ( response == 1) // boucle simple afin de forcer l'utilisateur à faire un choix
	{ 

	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	System.out.println("\n\n\n-----------------------------------------------------------------------------------------------------------------------------\n			COOKIFY\n\n\n");
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
	System.out.println("1. Prepare a recipe\n");
	System.out.println("2. My Health\n");
	System.out.println("3. Recipe Creator\n");
	System.out.println("4. Recipe storage\n");
	System.out.println("5. Shopping List\n");

	Scanner keyboard = new Scanner (System.in);
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------\nSelect an option or ESC to exit");
	int choix = keyboard.nextInt();

	
		switch(choix) // Utilisation de la Var scanner pour naviguer à travers le programme
		{
			case 1 :

			break;
			case 2 :
			bmiCalculator();
			response = 0; // sortie de boucle
			break;

			case 3 :

			break;

			case 4 :

			break;

			case 5 : 
			shoppingList();
			response = 0; // sortie de boucle
			break;

			default : System.out.println("Dunno, you can't read?");
		}
	
	}


	
	
    }
    /********** creation d'un stop avant retour au menu *********/
    System.out.println("enter any key to continue");
    Scanner retourMenu = new Scanner (System.in);
    String menuBoucle = retourMenu.next();
		/*********************** Cette fonction affiche les ingrédient d'une recette leur prix et leur prix total ********************/

		System.out.println(" Do you want to prepare the recipe of tea ? Y/N");

		Scanner keyboard = new Scanner (System.in);
		String retour = keyboard.next();


		if  (retour.equals ("Y") ) // si on entre Y on run la fonction recette thé
			{
			 shoppingThe();
			 System.out.println("");
			 String retour3 = keyboard.next();
			}
	}







	 
	
	// Cette fonction affiche une recette pour cookify
		public static void recetteThe ()
		{
		Scanner keyboard = new Scanner (System.in);
		int volumeEau = 30;
	 	int sachetDeThe = 1;
	 	int totalIngredient = 0;
	 	String the = "thé";
	 	String eau = "eau";

		 	totalIngredient = totalIngredient + 1;
		 	totalIngredient++;
		 	System.out.println("\n\n\n-----------------------------------------------------------------------------------------------------------------------------\n			COOKIFY\n\n\n");
		 	System.out.println("	Recipe : how to do an epic Tea of the doom \n 	Total Ingredients : " + totalIngredient);

		 	System.out.println("\n\n*Sachet de " + the + "					x" + sachetDeThe);
		 	System.out.print("*" + eau + "	  	  				x" + volumeEau + "cl\n\n");
		 	System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n			PREPARATION");
		 	System.out.println("Are you ready to continue ? Y/N");


		 	String retour1 = keyboard.next();
		if  (retour1.equals ("Y") ) // si on entre Y on run la fonction recette thé
			{
			System.out.print("Faire chauffer l'eau à une température comprise entre 60° et 70°\n");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Are you ready to continue ? Y/N");
			String retour2 = keyboard.next();
				if  (retour2.equals ("Y") ) // si on entre Y on run la fonction recette thé
				{
				System.out.print(" puis la verser dans un récipient ");
			    System.out.println(" prévu à cet éffet\n\nDéposer le sachet de thé dans l'eau pendant 5min\n");
			    System.out.println("Congratulations Ratatouille, you are a petit Chef!! ,:)");
				}
			}


		 	
		 	
		 	

		}
	public static void shoppingThe ()
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
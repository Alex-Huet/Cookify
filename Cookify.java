import java.util.Scanner;


public class Cookify
{	
	//classe pour l'onglet 3
		static class Recipe{

  		String nameRecette;
  		String complexity;
  		//minutes
  		String time;
  		String ingredient [] = new String [20];
  		int quantity[]= new int[20];

}
	// Developpé par Arnaud Alex et Adrien
	//GG toto pour avoir trouvÃ© la strat du tableau de string

	static String []theList = {"1.Warm the water around 60°C and 70°C\nThen pour it into something such as a cup\n\n","2.pour the bag of tea in the water for 5min\n","Congratulations Ratatouille, you are a petit Chef!! ,:)","Tata","Tati",""};
	static int dejaFait = 0;
	static int points = 0;


	public static void main (String[]args)
	{

	
		int boucle = 1;
		while(boucle == 1)
	{ 
			
	int response = 1; // variable utilisé pour les boucles

	/************************** 		Affichage du menu 		****************************/	
	while ( response == 1) // boucle simple afin de forcer l'utilisateur à faire un choix ainsi que de revenir au menu a la fin d'une recette/calcul bmi 
	{ 

	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	System.out.println("\n\n\n-----------------------------------------------------------------------------------------------------------------------------\n			COOKIFY\n\n\n");
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
	System.out.println("1. Prepare a recipe\n");
	System.out.println("2. My Health\n");
	System.out.println("3. Recipe Creator\n");
	System.out.println("4. Recipe storage\n");
	System.out.println("\n\n\n****Developpé par Arnaud Alex et Adrien ****\n****GG toto pour avoir trouvÃ© la strat du tableau de string****");

	Scanner keyboard = new Scanner (System.in);
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------\nSelect an option or ESC to exit");
	int choix = keyboard.nextInt();

	
		switch(choix) // Utilisation de la Var scanner pour naviguer à travers le programme
		{
			case 1 :
			
			System.out.print("Choissiez un numero de recette (1-2-3)");
			String choixRecette = keyboard.next();
				
				if(choixRecette.equals ("3") )
					{ us05The(); }
				else if(choixRecette.equals ("1"))
					{us05Pates();}
				else if(choixRecette.equals ("2"))
					{us05Omelette();}

				/*switch(choixRecette)
				{
					case 3 :
					us05The();
					break;
					case 2 :
					//fonction omelette.  ****** SWITCH NON FONCTIONNEL , Remplacé par un if*******
					break;
					case 1 :
					//fonction pates
					break;
				} */

			break;
			case 2 :
			bmiCalculator();
			response = 0; // sortie de boucle
			break;

			case 3 :
			creator();
			response = 0;
			break;

			case 4 :
			us07();
			response = 0;
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
			String [] ingredientList = {"thÃ©            " , "Cl d'eau       ","huile de coude "}; // Initialisation de mes tableaux
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
				resultat = priceList[i] * quantitiesList[i]; // calcul du prix d'un ingredient en fonction de sa quantitÃ©
				prixFinal = prixFinal + resultat; // calcul du prix total
				System.out.print("*" + ingredientList[i] + "					x" + quantitiesList[i] + "				 Unit Price    "  + priceList[i] + "â‚¬" + "	Total "+ priceList[i] * quantitiesList[i] + " â‚¬\n" );

			}

			System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n\n		 			 		* TOTAL PRICE * :" + prixFinal + "â‚¬");
			/********** creation d'un stop avant retour au menu *********/
    		System.out.println("enter any key to continue");
    		Scanner retourMenu = new Scanner (System.in);
    		String menuBoucle = retourMenu.next();
		}

	public static void bmiCalculator () // Fonction servant Ã  demander a l'utilisateur son poind sa taille et ensuite calculer son IMC
		{
			double bmi = 0; // Creation d'une Var decimale

			Scanner i = new Scanner (System.in); // Creation d'une Var scanner
			System.out.println("\n\n\n-----------------------------------------------------------------------------------------------------------------------------\n			COOKIFY\n\n\n");
			System.out.println("Enter your Height in meters (ex : 1,78): ");
			double height = i.nextFloat();
			System.out.println("Enter your weight in kilos (ex : 75)");
			double weight = i.nextFloat();
			// bmi = weight / (height*height);
			bmi = maths(weight,height);
			System.out.println("\nyour bmi is : "+ bmi);
			

/******************** Affichage des reponses en fonction des valeurs saisies par l'utilisateur *******************/

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
			/********** creation d'un stop avant retour au menu *********/
    		System.out.println("enter any key to continue");
    		Scanner retourMenu = new Scanner (System.in);
    		String menuBoucle = retourMenu.next();
		}


			public static double maths(double a,double b)
				{
					double c = 0;

					c = a /(b*b);



					return c;
				}


	public static void us07()

	{


		
		
// AFFICHAGE DE L'ENTETE //

			System.out.println("+---------------------------------------+");
			System.out.println("|                                       |");
			System.out.println("--------COOKIFY Your Personnal Chef------");
			System.out.println("|                                       |");
			System.out.println("+---------------------------------------+");
			System.out.println("										 ");
			System.out.println("										 ");
			System.out.println("Veuillez choisir une des trois recette présenté :\n");

// AFFICHAGE DES RECETTE, DE LEURS TEMPS DE PREPARATION ET DE LEURS COMPLEXITE //

			System.out.println("1. Pâtes à la carbonara (15 min, facile)\n");
			System.out.println("2. Omelette (15 min, facile)\n");
			System.out.println("3. Tasse de thé\n");

			Scanner keyboard = new Scanner(System.in); // LE SYSTEME ATTEND L'ENTREE D'UNE DONNEE DE L'UTILISATEUR //
			int choix = keyboard.nextInt();
			switch(choix)
			{

				case 1 :
					pates();
				break;
				case 2 :
					omelette();
				break;
				case 3 :
					the();
				default:
				System.out.println("Retour au menu \n");
			}
			System.out.println("Pour retourner au menu appuyez sur une touche : \n");

			String retourMenu = keyboard.next();
		
	}
	

// AFFICHAGE DE L'US03 //

	public static void pates()
	{
		float pates = 0;

		Scanner a = new Scanner(System.in);
		System.out.println("\n---------------COOKIFY-----------------\n	");
		System.out.println("---Recette des pâtes à la carbonara----\n");

		System.out.println("\n Difficulté : FACILE\n");
		System.out.println("Temps de préparation : environ 15 minutes\n");
		
		System.out.println("Estimation du prix total de la recette :\n");

		String [] ingredientList = {"250g Pâtes	", "oeuf	    ", "100g lardon	", "2L eau	    "}; 
		
		// Liste des ingrédient //
		
		int [] ingredientNb = { 1, 2, 1, 1};												        
		
		// Nombre d'ingrédient //
		
		float [] ingredientPrice = {1f, 0.7f, 2.5f, 1f};								        	

		// Prix unitaire des ingrédient //

		float total = 0;

		// Nouvelle variable avec le total //
		
		float totalFinal =0;


		for( int i = 0 ; i < ingredientList.length;i++)
		{

			total = ingredientPrice[i] * ingredientNb[i];

			totalFinal = totalFinal + total;

			System.out.println("    --"+ ingredientList[i] + "    		" + ingredientNb[i] + "       	 " + total); 

			// Boucle listant la liste, le nombre, et le prix global des ingrédient //
			
			System.out.println("---------------------------------------------------------------\n ");
		}

		System.out.println("Prix total de la recette : " + totalFinal + "€");
	}

	public static void omelette()
	{
		float omelette = 0;

		Scanner a = new Scanner(System.in);
		String [] ingredientsList = {"oeuf      " , "beurre    " , "sel       " , "poivre    "};
        int [] quantitiesList = {7 , 1 , 1 , 1};
        float [] priceList = {0.25f , 2 , 0.30f , 0.30f};
        float resultat = 0;
        float prixFinal = 0;

//Affichage de l'en-tête
      
      	System.out.println("+------------------------------------------------------+");
        System.out.println("                        COOKIFY            ");
        System.out.println("\nRecipe : Omelette");
        System.out.println("Time : 15 minutes");
        System.out.println("difficulty : easy ");
        System.out.println("shopping list (total ingredients : " + ingredientsList.length + " )");

        System.out.println("\n+------------------------------------------------------+\n");
        for (int i = 0; i < ingredientsList.length ; i++) 
        {
        //calcul du prix en fonction des ingrédients et de la quantité
        resultat = priceList[i] * quantitiesList[i];
        //Calcul du prix total
        prixFinal = prixFinal + resultat;
        //Affichage des valeurs
        System.out.println("* " + ingredientsList[i]+ "x" + quantitiesList[i] +"     "+ resultat + " €");

      
        System.out.println("\n+------------------------------------------------------+\n");
//Affichage du prix total
        System.out.println("Total price : " + prixFinal + " €");
    	}
	}

	public static void the()
	{
		float the = 0;

		Scanner a = new Scanner(System.in);
		String [] ingredientList = {"thé            " , "Cl d'eau       ","huile de coude "}; // Initialisation de mes tableaux
        float [] quantitiesList = {2,30,1};
        float [] priceList = {0.1f,0.05f,0f};
        int totalIngredient = ingredientList.length;
        float resultat = 0;
        float prixFinal = 0;

        System.out.println("\n\n\n-----------------------------------------------------------------------------------------------------------------------------\n                                COOKIFY\n\n"); //Affichage
        System.out.println("Time : 8min");
        System.out.println("Complexity : Easy");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n");


        System.out.println("Shopping list (total ingredient) : "+totalIngredient); // boucle pour afficher le contenu du tableau ingredient et calculer le prix
        for(int i = 0; i < ingredientList.length;i++)

        {
            resultat = priceList[i] * quantitiesList[i]; // calcul du prix d'un ingredient en fonction de sa quantité
            prixFinal = prixFinal + resultat; // calcul du prix total
            System.out.print("*" + ingredientList[i] + "                    x" + quantitiesList[i] + "                 Unit Price    "  + priceList[i] + "€" + "    Total "+ priceList[i] * quantitiesList[i] + " €\n" );
		}

		System.out.println("Voulez vous lancer l'assistant ? Y/N\n");
		String choice = a.next();
		
		if( a.equals("Y"))
			{
				recetteThe();
			}
	}

/********************************************************************************************** RECETTES EN LOOP ************************************************************************/

public static void us05The ()
	{

		/*********************** Cette fonction utilise un tableau et un scanner pour afficher etape par etape la recette ********************/


	 String []recetteList = {"\n\n1.Warm the water around 60°C and 70°C\nThen pour it into something such as a cup\n\n","2.pour the bag of tea in the water for 5min\n","\n\nCongratulations Ratatouille, you are a petit Chef!!","\n\n Recipe done, press O to go back to Menu"};
	 int dejaFait = 0;
	 int points = 0;

		//System.out.println(" Do you want to prepare the recipe of tea ? Y/N"); inutile

		Scanner keyboard = new Scanner (System.in);
		String retour = "Y";
		int positionTableau = 0;
		// int dejaFait = 0; ces deux Var existent deja dans le code
		//int points = 0;

		if (retour.equals("Y"))
		{
			do
			{	

				if(retour.equals("B"))
				{
					positionTableau = positionTableau - 2;
					System.out.println("\n\n\n" + recetteList[positionTableau]);
					System.out.println("\n\n\nDo you want to continue? Y/N");
					System.out.println(" " + positionTableau);
					retour = keyboard.next();
				}
				else if (retour.equals("O")) 
				{
					positionTableau = 0;
				}
				else
				{
					System.out.println(" " + positionTableau);
					System.out.println("\n\n\n " + recetteList[positionTableau]);
					positionTableau++;
					System.out.println("\n\n\nDo you want to continue, stop , or go back? Y/O/B (O to OUT)\n");
					retour = keyboard.next();
				}


			} while((retour.equals("Y") && positionTableau <= recetteList.length )|| retour.equals("B"));

				if(dejaFait == 0)
				{
					points += 10;
					dejaFait = 1;
				}
				else
				{
					points += 5;
				}
				System.out.println("Felicitation vous avez gagner " + points + "points");

		}


	}
public static void us05Pates ()
	{

		/*********************** Cette fonction utilise un tableau et un scanner pour afficher etape par etape la recette ********************/


	 String []recetteList = {"\n\n1.Boil the water\n\n","2.\n","\n\n2.Pour the pasta into the water ", "\n\n3.When it's done add the lardonino , the eggs and salt it","\n\nRecipe done, press O to go back to Menu"};
	 int dejaFait = 0;
	 int points = 0;

		//System.out.println(" Do you want to prepare the recipe of tea ? Y/N"); inutile

		Scanner keyboard = new Scanner (System.in);
		String retour = "Y";
		int positionTableau = 0;
		// int dejaFait = 0; ces deux Var existent deja dans le code
		//int points = 0;

		if (retour.equals("Y"))
		{
			do
			{	

				if(retour.equals("B"))
				{
					positionTableau = positionTableau - 2;
					System.out.println(recetteList[positionTableau]);
					System.out.println("\n\n\nDo you want to continue? Y/N");
					retour = keyboard.next();
				}
				else if (retour.equals("O")) 
				{
					positionTableau = 0;
				}
				else
				{
					System.out.println("\n\n" + recetteList[positionTableau]);
					positionTableau++;
					System.out.println("\n\n\nDo you want to continue, stop , or go back? Y/O/B (O to OUT)\n");
					retour = keyboard.next();
				}

			} while((retour.equals("Y") && positionTableau <= recetteList.length )|| retour.equals("B"));

				if(dejaFait == 0)
				{
					points += 10;
					dejaFait = 1;
				}
				else
				{
					points += 5;
				}
				System.out.println("Felicitation vous avez gagner " + points + "points");

		}


	}
public static void us05Omelette ()
	{

		/*********************** Cette fonction utilise un tableau et un scanner pour afficher etape par etape la recette ********************/


	 String []recetteList = {"\n\n1.Faites chauffer le beurre, versez-en un peu dans les oeufs et mélangez.\n\n","\n\n2.Faites chauffer le beurre, versez-en un peu dans les oeufs et mélangez. \nVersez les oeufs dans la poêle à feu vif", "\n\n3.baissez le feu et laissez cuire doucement en ramenant les bords de l'omelette au centre au fur et à mesure qu'ils prennent.\n","\n\n 4.Secouez un peu la poêle pour éviter que l'omelette n'attache, \nvérifiez la texture baveuse ou bien prise","\n\nRecipe done, press O to go back to Menu"};
	 int dejaFait = 0;
	 int points = 0;

		//System.out.println(" Do you want to prepare the recipe of tea ? Y/N"); inutile

		Scanner keyboard = new Scanner (System.in);
		String retour = "Y";
		int positionTableau = 0;
		// int dejaFait = 0; ces deux Var existent deja dans le code
		//int points = 0;

		if (retour.equals("Y"))
		{
			do
			{	

				if(retour.equals("B"))
				{
					positionTableau = positionTableau - 2;
					System.out.println("\n\n" + recetteList[positionTableau]);
					System.out.println("\n\n\nDo you want to continue? Y/N");
					retour = keyboard.next();
				}
				else if (retour.equals("O")) 
				{
					positionTableau = 0;
				}
				else
				{
					System.out.println(recetteList[positionTableau]);
					positionTableau++;
					System.out.println("\n\n\nDo you want to continue, stop , or go back? Y/O/B (O to OUT)n");
					retour = keyboard.next();
				}

			} while((retour.equals("Y") && positionTableau <= recetteList.length )|| retour.equals("B"));

				if(dejaFait == 0)
				{
					points += 10;
					dejaFait = 1;
				}
				else
				{
					points += 5;
				}
				System.out.println("Felicitation vous avez gagner " + points + "points");

		}


	}
	//début de la partie création de recette
	public static void creator(){

  	//initialisation de la boucle des ingrédients
  	int ing = 1;

  	//création du champs de saisie
  	Scanner scanner2 = new Scanner(System.in);

  	//nom de la section
  	System.out.println("Recipe creator\n");

  	//nom de la recette
  	System.out.println("Recipe name (omelette): ");
  	String nameRecette = scanner2.next();

  	//Difficulté de préparation
  	System.out.println("Difficulty (facile): ");
    String complexity = scanner2.next();

  	//Temps de préparation de la recette
  	System.out.println("Time (5min): ");
  	String time = scanner2.next();

  	//cout total de la recette
  	System.out.println("Total cost (5,60) : ");
  	float totalCost = scanner2.nextFloat();

  	//début de la boucle pour l'intégration des ingrédients et les quantités
  	while ( ing == 1) {
  	System.out.println("ingredient (tomate): ");
    String ingredient = scanner2.next();

  	System.out.println("Ingredient quantity (4)");
  	int quantity = scanner2.nextInt();

  	System.out.println("Avez-vous fini ? (Y/N)\n");
  	String choix = scanner2.next();

  	if (choix.equals("Y")) {
      ing++;
      System.out.println("Game over !");
  	}
}
}


}
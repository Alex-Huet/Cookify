import java.util.Scanner;


public class US04

{
	public static void main (String[]args)
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
    }

    public static void shoppingList ()
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
			/********** creation d'un stop avant retour au menu *********/
    		System.out.println("enter any key to continue");
    		Scanner retourMenu = new Scanner (System.in);
    		String menuBoucle = retourMenu.next();
		}

	public static void bmiCalculator () // Fonction servant à demander a l'utilisateur son poind sa taille et ensuite calculer son IMC
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
}
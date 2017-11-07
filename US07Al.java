import java.util.Scanner;

	public class US07
{
		public static void main(String[]args)

	{

		int boucle = 0;

		while (boucle < 1)

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
				System.out.println("Veuillez choisir une des 3 recette présenté \n");
			}
			System.out.println("Pour retourner au menu appuyez sur une touche : \n");

			String retourMenu = keyboard.next();
		}

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

	}

}
	

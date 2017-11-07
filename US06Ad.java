import java.util.Scanner;

public class US06Ad {

  //classe pour l'onglet 3
  static class Recipe{

    String nameRecette;
    String complexity;
    //minutes
    int time;
    String ingredient [] = new String [20];
    int quantity[]= new int[20];

    double totalCost;

  }

  public static void main(String[] args) {

    //initialisation de la valeur de la boucle à 0
    int boucle = 0;

    //Début de la boucle de retour au menu
    while (boucle < 1) {

    //Création du menu
    System.out.println("+------------------------------------------------------+\n");
    System.out.println("               COOKIFY  your personnal chief          \n");
    System.out.println("                       (0 points)            \n");
    System.out.println("--------------------------------------------------------\n");
    System.out.println("1. Prepare a recipe.\n");
    System.out.println("2. My health.\n");
    System.out.println("3. Recipe creator.\n");
    System.out.println("4. Recipe Storage\n");
    System.out.println("--------------------------------------------------------");
    System.out.println("Veuillez choisir une valeur ou appuyez sur esc pour quitter ");

    //création du champs de saisie pour le menu
    Scanner scanner = new Scanner(System.in);

    //Saisie de la valeur pour le menu
    int menu = scanner.nextInt();

    //appel des fonctions du menu
    switch(menu){
      case 1:
        ShoppingList();
      break;
      case 2:
        BMI();
      break;
      case 3:
        creator();
      break;
    case 4:
      break;
    default:
      System.out.println("Veuillez sélectionner une valeur correcte.");
    }
    System.out.println("\nPour retourner au menu appuiez sur une touche : ");

    String retourMenu = scanner.next();
      }
    }
    public static void ShoppingList () {
      //création de tableaux de Liste
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
      for (int i = 0; i < ingredientsList.length ; i++) {
        //calcul du prix en fonction des ingrédients et de la quantité
        resultat = priceList[i] * quantitiesList[i];
        //Calcul du prix total
        prixFinal = prixFinal + resultat;
        //Affichage des valeurs
        System.out.println("* " + ingredientsList[i]+ "x" + quantitiesList[i] +"     "+ resultat + " €");
      }

      System.out.println("\n+------------------------------------------------------+\n");
      //Affichage du prix total
      System.out.println("Total price : " + prixFinal + " €");

    }

      //Début de la partie IMC
      public static void BMI() {
        float bmi = 0;

        //Scanner des informations (taille/poids)
        Scanner sc = new Scanner (System.in);
        System.out.println("Pour calculer votre IMC, entrez votre taille en mètre avec virgule : ");
        float height = sc.nextFloat();
        System.out.println("Maintenant veuillez entrer votre poids : ");
        float weight = sc.nextFloat();

        //Calcul de l'IMC
        bmi = weight / (height*height);
        System.out.println("Votre IMC est de : " + bmi);

        //condition en fonction de l'IMC
        if (bmi < 16.5) {
          System.out.println("Vous êtes en sous nutrition, contactez un nutritionniste !");
        }
        if (bmi > 16.5 && bmi < 18.5) {
          System.out.println("Vous êtes maigre, mangez un peu plus !");
        }
        if (bmi > 18.5 && bmi < 25) {
          System.out.println("Votre IMC est normal, continuez !");
        }
        if (bmi > 25 && bmi < 30) {
          System.out.println("Vous êtes en surpoids !");
        }
        if (bmi > 30 && bmi < 35) {
          System.out.println("Vous êtes en obésité légère, faites attention à vous !");
        }
        if (bmi > 35 && bmi < 40) {
          System.out.println("Vous êtes en obésité sévère, allez consulter !");
        }
        if (bmi > 40) {
          System.out.println("Tiens, ça sent pas le sapin ?");
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
      System.out.println("Recipe name : ");
      String nameRecette = scanner2.next();

      //Difficulté de préparation
      System.out.println("Difficulty : ");
      String complexity = scanner2.next();

      //Temps de préparation de la recette
      System.out.println("Time : ");
      int time = scanner2.nextInt();

      //cout total de la recette
      System.out.println("Total cost : ");
      float totalCost = scanner2.nextFloat();

      //début de la boucle pour l'intégration des ingrédients et les quantités
      while ( ing == 1) {
      System.out.println("ingredient : ");
      String ingredient = scanner2.next();

      System.out.println("quantity");
      int quantity = scanner2.nextInt();

      System.out.println("Avez-vous fini ? (y/n)\n");
      String choix = scanner2.next();

      if (choix.equals("y")) {
          ing++;
          System.out.println("Game over !");
      }
    }
  }
}

// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    Scanner keyboard = new Scanner (System.in); 

	String firstName; // User's first name
	String itemOrder; // Item ordered
	String frostingType; // Frosting ordered
	String fillingType; // Filling ordered
	String toppings; // Toppings ordered
	String input;  // User input

	double cost = 15.00; // Cost of cake and cupcakes
	final double TAX_RATE = .08;  // Sales tax rate
	double tax; // Amount of tax
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS


	 
    // Introduce shop and prompt user to input first name
System.out.println("Welcome to Java's Cake & Cupcake Shop!");
System.out.println("We make custom cakes with our secret cake batter!");
System.out.print("What is your first name?");
	  
	  
    // TEST CODE
firstName = keyboard.nextLine();
System.out.print(firstName + ", please see our MENU below: ");
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
System.out.print("\n"); // skips a line	  
      
    // TEST CODE     
System.out.println("_______________________________________________");      
System.out.println("        MENU         QUANTITY    BASE COST  ");
System.out.println("_______________________________________________"); 
System.out.println("        Cake            1           $15     ");
System.out.println("   Set of Cupcakes      6           $15     ");
System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
System.out.println("_______________________________________________");
    // STEP 4 DISPLAY MENU

	
      

    // TEST CODE     
System.out.println("Do you want CUPCAKES or a CAKE?");
itemOrder = keyboard.nextLine();
    // STEP 5 PROMPT USER TO ORDER

  
	  
	  
	  
      
    // TEST CODE
System.out.println("What type of FROSTING do you want? ");
System.out.println("Vanilla, Chocolate, Strawberry or Coco");
frostingType = keyboard.nextLine();
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

   
	 
	 
	 
      
    //TEST CODE
System.out.println("What type of FILLING do you want? ");
System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
fillingType = keyboard.nextLine();
    // STEP 7 PROMPT USER TO CHOOSE FILLING


	  
	  
      
    // TEST CODE
System.out.println("What type of TOPPINGS do you want? ");
System.out.println("Sprinkles, Cinnamon, Cocoa, Nuts");
toppings = keyboard.nextLine();
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS


	
      
      
    // TEST CODE
      	System.out.println("You order the"+frostingType+"with"+fillingType+toppingType+",Yes or No?");
	intput = keyboard.nextLine();
    // STEP 9 DISPLAY ORDER CONFIRMATION


      
	  
	  
	  
    
    // TEST CODE
	tax = cost*TAX_RATE
      	System.out.println("You cost"+cost+"about"+frostingType);
	System.out.println("the sales tax is"+tax);
      }
    // STEP 10 DISPLAY COST AND SALES TAX
  
    }   
}

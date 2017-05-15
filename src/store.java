import java.util.Scanner;

/**
 * Created by canidmars on 5/15/17.
 */
public class store {

    static Scanner input = new Scanner(System.in);

    static String itemName;
    static double itemPrice;
    static double itemQuantity;
    static double currentTotalSale = 0;
    static int counter = 0;
    static String receiptString = "";
    static String customerName;
//    static String yesNo = "";

    //Method for displaying store name and showing Menu Options

    public static void displayMainMenuForUser() {
        System.out.println("Welcome to Our Java Store\nPlease select an option from the menu:");
        System.out.println("1. Purchase Item");
        System.out.println("2. Print Receipt");
        System.out.println("3. Exit Sale");
        int menuChoice = input.nextInt();

        if (menuChoice == 1) {
            askUserForItemName();
        } else if (menuChoice == 2) {
            printReceiptForUser();
        } else if (menuChoice == 3) {
            userExitsMenu();
        } else {
            System.out.println("Answer needs to be 1, 2 or 3");
            displayMainMenuForUser();
        }
    }

    //Method for Sale
    //method for item name/type
    //method for price
    //method for quantity

    public static void askUserForItemName() {
        if (counter==0){
            System.out.println("Welcome, what is your name?");
            input.nextLine();
            customerName = input.nextLine();

        }
        System.out.println("What is the name of the item would you like to buy?");
        if(counter>0) {
        input.nextLine();
        }
        itemName = input.nextLine();
        if (!itemName.equals(null)){
            askUserForItemQuantity();
        }
    }

    public static void askUserForItemQuantity() {
        System.out.println("How many would you like to buy?");
        itemQuantity = input.nextDouble();
        askUserForPriceOfItem();
    }

    public static void askUserForPriceOfItem() {
        System.out.println("What is the price of the item?");
        itemPrice = input.nextDouble();
        completeInfoOfOrder();
        calculatingCompleteTotal();
        askUserIfTheyWantToReturnToMainMenu();
    }

    public static String completeInfoOfOrder() {
        counter++;
        return receiptString = receiptString + counter + ". Purchased " + itemQuantity + " " + itemName + " at $" + itemPrice + " each\n";
    }

    public static double calculatingCompleteTotal() {
        return currentTotalSale = currentTotalSale + (itemQuantity * itemPrice);
    }

    //Method for Receipt
    //Method to get # of items
    //Method to get name
    //Method to get price

    public static void printReceiptForUser() {
        System.out.println("Thank you " + customerName + " Your purchases are:");
        System.out.println(receiptString);
        System.out.println("Your total is: $" + currentTotalSale);
        userExitsMenu();
    }

    //Method to return to Main Menu

    public static void askUserIfTheyWantToReturnToMainMenu() {
        System.out.println("Would you like to return to the main menu? (y/n)");
        input.nextLine();
        String yesNo = input.nextLine();
        if(yesNo.equalsIgnoreCase("y")){
            displayMainMenuForUser();
        }
        else {
            userExitsMenu();
        }
    }

    public static void userExitsMenu() {
        System.out.println("Thank you for shopping!");
        System.exit(0);
    }

    //Running Store

    public static void main(String[] args) {
        displayMainMenuForUser();
    }

}

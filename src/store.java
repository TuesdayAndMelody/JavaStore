import java.util.Scanner;

/**
 * Created by canidmars on 5/15/17.
 */
public class store {

    static Scanner input = new Scanner(System.in);

    //Method for displaying store name and showing Menu Options

    //Method for Sale
        //method for item name/type
        //method for price
        //method for quantity

    static String itemName;
    static double itemPrice;
    static int itemQuantity;
    static double currentTotalSale = 0;
    static int counter = 0;
    static String receiptString;

    public static String askUserForItemName(){
        System.out.println("What is the name of the item would you like to buy?");
        return itemName = input.nextLine();
    }

    public static int askUserForItemQuantity(){
        System.out.println("How many would you like to buy?");
        return itemQuantity = input.nextInt();
    }

    public static double askUserForPriceOfItem(){
        System.out.println("What is the price of the item?");
        return itemPrice = input.nextDouble();
    }

    public static String completeInfoOfOrder(){
        counter++;
        return receiptString = counter + "." + itemQuantity + " " + itemName + " at $" + itemPrice + " each\n";
    }

    public static double calculatingCompleteTotal(){
        return currentTotalSale = currentTotalSale + (itemQuantity * itemPrice);
    }

    //Method for Receipt
        //Method to get # of items
        //Method to get name
        //Method to get price

    //Method to return to Main Menu

}

package OnlineStore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreMain {

    public static final String FILE_LOCATION_LOCAL = "D:\\Java_sda\\IntelliJ_projects\\OnlineStore\\ListOfItems.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Login user1 = new Login("Neringa", "slaptazodis");
        if (Users.valueOf(user1.userName.toUpperCase()).getPassword().equals(user1.password)) {
            System.out.println("Welcome, " + user1.userName + ", to the Store!");


            try {
                Scanner fileScanner = new Scanner(new File(FILE_LOCATION_LOCAL));
                System.out.println("List of items: ");
                int lineNumber = 1;
                while (fileScanner.hasNext()) {
                    System.out.println(lineNumber + ". " + fileScanner.nextLine());
                    lineNumber++;
                }
                fileScanner.close();
            } catch (IOException e) {
                System.out.println("KLAIDA!");
            }
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION_LOCAL));
            List<String> listOfItems = new ArrayList<String>();

            for (int i = 0; fileScanner.hasNext(); i++) {
                listOfItems.add(fileScanner.nextLine());
            }
            System.out.println("*******************");
            //System.out.println(listOfItems);

            List<String> cart1 = new ArrayList<String>();
            Cart firstItemOfCart = new Cart(5, 1);
            System.out.println("Added item to cart: " + listOfItems.get(firstItemOfCart.itemNumber - 1));
            cart1.add(listOfItems.get(firstItemOfCart.itemNumber - 1));
            System.out.println("Price: " + firstItemOfCart.getPrice() + " €");

            Cart secondItemOfCart = new Cart(2, 2);
            System.out.println("Added item to cart: " + listOfItems.get(secondItemOfCart.itemNumber - 1));
            cart1.add(listOfItems.get(secondItemOfCart.itemNumber - 1));
            System.out.println("Price: " + secondItemOfCart.getPrice() + " €");

            Cart thirdItemOfCart = new Cart(1, 3);
            System.out.println("Added item to cart: " + listOfItems.get(thirdItemOfCart.itemNumber - 1));
            cart1.add(listOfItems.get(thirdItemOfCart.itemNumber - 1));
            System.out.println("Price: " + thirdItemOfCart.getPrice() + " €");

            System.out.println("*****************************");
            System.out.println("List of items added to cart: " + cart1);
            List<Double> pricesOfPurchasedItems = new ArrayList<Double>();
            pricesOfPurchasedItems.add(firstItemOfCart.getPrice());
            pricesOfPurchasedItems.add(secondItemOfCart.getPrice());
            pricesOfPurchasedItems.add(thirdItemOfCart.getPrice());

            double totalPrice = 0;
            for (double i : pricesOfPurchasedItems) {
                double newTotalPrice = totalPrice + i;
                totalPrice = newTotalPrice;
            }
            System.out.println("Total price: " + totalPrice + " €");

            System.out.println("*****************************");
            Message message = new Message();
            message.sendMessage();
            System.out.print(Users.valueOf(user1.userName.toUpperCase()).getEmail());
        } else {
            System.out.println("Sorry, password was not confirmed.");
        }


    }


}


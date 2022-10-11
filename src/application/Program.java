package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Price: ");
        double price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = scan.nextInt();

        Product product = new Product(name, price, quantity);


        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the amount of products to be added in stock: ");
        product.addProducts(scan.nextInt());

        System.out.println();
        System.out.println("Stock has been updated: " + product);

        System.out.println();
        System.out.print("Enter the amount of products to be removed of stock: ");
        product.removeProducts(scan.nextInt());

        System.out.println();
        System.out.println("Stock has been updated: " + product);

        scan.close();
    }
}

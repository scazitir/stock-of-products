package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data");
        System.out.print("Name: ");
        product.name = scan.nextLine();
        System.out.print("Price: ");
        product.price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = scan.nextInt();

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

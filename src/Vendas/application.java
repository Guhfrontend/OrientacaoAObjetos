package Vendas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        application televisao = new application();

        product product = new product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.nome = scan.nextLine();
        System.out.print("Price: ");
        product.price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = scan.nextInt();

        product.toString();

         System.out.println("Enter the number of products to be added in stock: ");
         int quantity = scan.nextInt();
         product.addProduct(quantity);

        product.toString();

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProduct(quantity);

        product.toString();
    }
}

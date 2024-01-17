package Vendas;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Price: ");
        double price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = scan.nextInt();

        product product = new product(name, price, quantity);

        product.toString();

        product.setNome("Computer");
        System.out.println(product.getnome());

        System.out.println("Enter the number of products to be added in stock: ");
         quantity = scan.nextInt();
        product.addProduct(quantity);

        product.toString();

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProduct(quantity);

        product.toString();

    }
}

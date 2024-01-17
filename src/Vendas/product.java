package Vendas;


public class product {

    private String name;
    private double price;
    private int quantity;


    public product() {
    }

    public product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        System.out.println("Product data: " + name + ", $" + price + ", " + quantity + " units, " + "Total: $" + totalValueInStock());
        return null;
    }
    public String getnome(){
        return name;
    }
    public void setNome(String nome) {
        this.name = nome;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }



}

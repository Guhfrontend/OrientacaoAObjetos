package Vendas;

import javax.xml.namespace.QName;

public class product {

    public String nome;
    public double price;
    public int quantity;

public double totalValueInStock(){
    return price*quantity;
}
public void addProduct(int quantity) {
    this.quantity += quantity;
}
public void removeProduct(int quantity){
    this.quantity -= quantity;
}

public String toString(){
    System.out.println("Product data: "+ nome + ", $" + price+", "+ quantity+ " units, " + "Total: $" + totalValueInStock());
    return null;
}



}

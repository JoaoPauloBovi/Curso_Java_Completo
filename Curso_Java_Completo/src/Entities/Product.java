package Entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStrock() {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", R$ " + price + ", " + quantity + " units, Total: $" + TotalValueInStrock();
    }
}

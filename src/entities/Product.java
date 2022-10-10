package entities;

public class Product {

    // Clas attributes
    public String name;
    public Double price;
    public Integer quantity;

    //Methods
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(", $");
        sb.append(this.price);
        sb.append(", ");
        sb.append(this.quantity);
        sb.append(" units, Total: $");
        sb.append(this.totalValueInStock());

        return sb.toString();
    }
}

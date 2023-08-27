import java.util.ArrayList;

public class Customer {
    private int id = 0;

    private String name = "";
    private ArrayList<Item> cart = new ArrayList<>();

    Customer(){

    }
    Customer(int id, String name){
        this.id = id;
        this.name= name;
    }
    void setId(int value){
        id = value;
    }
    int getId(){
        return id;
    }
    void setName(String value){
        name = value;
    }
    String getName(){
        return name;
    }

    void addToCart(Item value){
        cart.add(value);
    }
    void emptyCart(){
        cart.clear();
    }

    ArrayList<Item> getCart(){
        return cart;
    }
}

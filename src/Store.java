import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Item> items = new ArrayList<>();
    Scanner obj = new Scanner(System.in);
    Scanner obj2 = new Scanner(System.in);

    void addCustomer(){
        System.out.println("Enter The Customer Id: ");
        int id = obj2.nextInt();
        System.out.println("Enter The Customer Name: ");
        String name = obj.nextLine();
        Customer customer = new Customer(id,name);
        customers.add(customer);
        run();
    }
    void addItem(){
        System.out.println("Enter The Item Id");
        int id = obj2.nextInt();
        System.out.println("Enter The Item Title");
        String title = obj.nextLine();
        System.out.println("Enter The Item Quantity");
        int quantity = obj2.nextInt();
        System.out.println("Enter The Item Price");
        double price = obj2.nextInt();
        System.out.println("Enter The Item Type");
        Type type = Type.valueOf(obj.nextLine());
        Item item = new Item();
        item.setId(id);
        item.setTitle(title);
        item.setQuantity(quantity);
        item.setPrice(price);
        item.setType(type);
        switch (type){
            case Book:
                System.out.println("Enter The Author Name");
                String authorName = obj.nextLine();
                System.out.println("Enter The Language");
                String language = obj.nextLine();
                item.setLanguage(language);
                item.setAuthorName(authorName);
                break;
            case Shoes:
                System.out.println("Enter The Style");
                String style = obj.nextLine();
                System.out.println("Enter The Color");
                String color = obj.nextLine();
                System.out.println("Enter The Size");
                int size = obj2.nextInt();
                item.setStyle(style);
                item.setColor(color);
                item.setSize(size);
                break;
            case Game:
                System.out.println("Enter The Release Date");
                String releaseDate = obj.nextLine();
                System.out.println("Enter The Company Name");
                String companyName = obj.nextLine();
                System.out.println("Enter The rating");
                double rating = obj2.nextDouble();
                item.setReleaseDate(releaseDate);
                item.setCompanyName(companyName);
                item.setRating(rating);
                break;
        }

        items.add(item);
        run();
    }

    void addItemToCustomerCart(){
        Customer customer = getCustomer();
        if(customer == null){
            System.out.println("The Customer Is Not Exist");
            return;
        }
        Item item = getItem();
        if (item == null){
            System.out.println("The Item Is Not Exist");
            return;
        }

        customer.addToCart(item);
        run();

    }

    void viewTheItemsInCustomerCart(){
        Customer cust = getCustomer();
        if(cust == null){
            System.out.println("The User Is Not Exist");
        }
        for (int i =0; i<cust.getCart().size(); i++){
            Item item = cust.getCart().get(i);
            System.out.println(item.getId()+" "+item.getTitle()+" "+item.getQuantity()+" "+ item.getPrice());
            switch (item.getType()){
                case Book :
                    System.out.println(item.getAuthorName()+" "+ item.getLanguage());
                    break;
                case Shoes:
                    System.out.println(item.getStyle()+" "+ item.getSize()+" "+ item.getColor());
                    break;
                case Game:
                    System.out.println(item.getReleaseDate()+" "+ item.getCompanyName()+" "+ item.getRating());
            }
        }
    }

    void viewItems(){
        for (int i =0; i<items.size(); i++){
            Item item = items.get(i);
            System.out.println(item.getId()+" "+item.getTitle()+" "+item.getQuantity()+" "+ item.getPrice());
            switch (item.getType()){
                case Book :
                    System.out.println(item.getAuthorName()+" "+ item.getLanguage());
                    break;
                case Shoes:
                    System.out.println(item.getStyle()+" "+ item.getSize()+" "+ item.getColor());
                    break;
                case Game:
                    System.out.println(item.getReleaseDate()+" "+ item.getCompanyName()+" "+ item.getRating());
            }
        }
        run();
    }

    Item getItem(){
        System.out.println("Enter The Id");
        int id = obj2.nextInt();
        for (int i =0; i<items.size();i++){
            Item item = items.get(i);
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    Customer getCustomer(){
        System.out.println("Enter The Id");
        int id = obj2.nextInt();
        for (int i =0; i<customers.size();i++){
            Customer customer = customers.get(i);
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    void run(){
        System.out.println("1. Add Item To Store");
        System.out.println("2. Add Customer To Store");
        System.out.println("3. Add Item To Customer Cart");
        System.out.println("4. View Item In The Store");
        System.out.println("5. View Item In The Customer Card");
        System.out.println("Enter Your Choice");
        int choice = obj2.nextInt();
        switch (choice){
            case 1:
                addItem();
                break;
            case 2:
                addCustomer();
                break;
            case 3:
                addItemToCustomerCart();
                break;
            case 4:
                viewItems();
                break;
            case 5:
                viewTheItemsInCustomerCart();
            default:
                run();
        }
    }
}
// When The Using Add Item To Customer Cart (Display All Items Before)
// Using Quantity When The User Add To Cart User( quantity--;)
// Use Empty Customer Cart
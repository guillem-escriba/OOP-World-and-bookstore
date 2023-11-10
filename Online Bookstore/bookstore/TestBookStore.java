package bookstore;

public class TestBookStore {
    public static void main(String[] args) {
     
        Catalog catalog = new Catalog();
        ShoppingCart cart = new ShoppingCart(catalog);
        BookStore store = new BookStore(catalog, cart);
        
    }
        
}

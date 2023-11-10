package bookstore;

import java.util.Currency;

import javax.swing.colorchooser.ColorSelectionModel;

public class ShoppingCart extends BookCollection implements ShoppingCartInterface {
    private Catalog catalog;

    public ShoppingCart(Catalog catinit){ 
        this.catalog = catinit; // Se guarda la referencia del catálogo de la tienda
        Catalog shoppingCart = new Catalog(); // Se crea un nuevo catalog que posteriormente se establecerá el stock a 0
        for (StockInterface stock : shoppingCart.collection){ // Para que no se sobreescriban ambos catálogos se crea uno nuevo y se pasa a la collection de Shopping Cart que es la que gestionará todo
            stock.removeCopies(stock.numberOfCopies());
            collection.add(stock);
        }
    }
    

    @Override
    public double totalPrice() { //Hemos planteado esta función como la suma de los precios de cada copia en vez de la de stock
        double total = 0;
        for (StockInterface stock : collection){
            total += stock.numberOfCopies()*stock.totalPrice();
        }
        return total;
    }

    @Override
    public String checkout() {
        Payment payment = new Payment();
        int VISANumber = 47229456;
        String cardHolder = new String("John Smith");
        Currency currency = Currency.getInstance("EUR");
        payment.doPayment(VISANumber, cardHolder, totalPrice(), currency);
        for(StockInterface stock:collection){ // Se eliminan las copias del carrito una vez pagadas
            stock.removeCopies(stock.numberOfCopies());
        }
        return null;
    }

    @Override
    public void addCopies(int numberOfCopies, String booktitle){
        StockInterface stock = catalog.getStock( booktitle );
		if(stock.numberOfCopies() >= numberOfCopies){ // Solo lo permite si el número de copias que se quieren pasar es menor o igual a las que hay en stock
            StockInterface cart = getStock(booktitle);
            cart.addCopies(numberOfCopies);
            stock.removeCopies(numberOfCopies);
        }
    }
    @Override
    public void removeCopies(int numberOfCopies, String booktitle){
        StockInterface cart = getStock( booktitle );
		if(cart.numberOfCopies() >= numberOfCopies){ // Solo lo permite si el número de copias que se quieren pasar es menor o igual a las que hay en el carrito
            StockInterface stock = catalog.getStock(booktitle);
            stock.addCopies(numberOfCopies);
            cart.removeCopies(numberOfCopies);
        }
    }
        
}

package bookstore;

import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.LinkedList;

public class Catalog extends BookCollection{
    public Catalog(){
        super();
        LinkedList< String[]> store = new LinkedList<>();
        store = BookCollection.readCatalog("bookstore\\books.xml");  // Lista de strings
        for(String[] s:store){ // Por cada string
            Date date = new Date();
            try{ date = new SimpleDateFormat().parse( s[2]); } // Se prueba si cumple con el formato de fecha
            catch(Exception e){}
            long isbn = Long.parseLong(s[4]);
            double price = Double.parseDouble(s[5]);
            Currency currency = Currency.getInstance(s[6]);
            int copies = Integer.parseInt(s[7]);
            Book book = new Book(s[0], s[1], date, s[3], isbn); // Se añaden los datos a book
            StockInterface stock = new Stock(book, price, currency, copies); // Se crea un nuevo stock de cada book
            super.collection.add(stock);
        }
    }
}

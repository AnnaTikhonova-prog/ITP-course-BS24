
public class Book {
    String name;
    double price;
    int qty =0;
    Author author;

    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author author(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + name + ", " + author + ", price=" + price + ", qty=" + qty + "]";
    }
}

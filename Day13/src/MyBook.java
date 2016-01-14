public class MyBook extends Book {
    public int price;

    public MyBook(String title, String author, int bookPrice) {
        super(title, author);
        this.price = bookPrice;
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

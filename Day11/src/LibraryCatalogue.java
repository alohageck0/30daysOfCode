import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
    //Properties/fields
    Map<String, Book> bookCollection = new HashMap<>();
    int currentDay = 0;
    int lengthOfCheckOut = 7;
    double initialLateFee = 0.5;
    double feePerLateDay = 1;

    // Construcors
    public LibraryCatalogue(Map<String, Book> collection) {
        this.bookCollection = collection;
    }

    public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckOut,
                            double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckOut = lengthOfCheckOut;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    //Getters
    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return this.bookCollection.get(bookTitle);
    }

    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getLengthOfCheckOut() {
        return this.lengthOfCheckOut;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    //Setters

    public void nextDay(int day) {
        currentDay++;
    }

    public void setDay(int day) {
        this.currentDay = day;
    }

    //Instance methods:
    public void checkOut(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookCHeckedOut(book);
        } else {
            book.setCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day" + (getCurrentDay() + getLengthOfCheckOut()) + ".");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckOut());
        if (daysLate > 0) {
            System.out.println("You owe library $" + (getInitialLateFee()
                    + getFeePerLateDay() * daysLate)
                    + " because your book is "
                    + daysLate + " days over due");
        } else {
            System.out.println("Thank you");
        }
        book.setCheckedOut(false, -1);
    }

    public void sorryBookCHeckedOut(Book book) {
        System.out.println("Sorry " + book.getTitle()
                + " already checked out. It should be back on day "
                + (book.getDayCheckedOut() + getLengthOfCheckOut()));
    }

    public static void main(String[] args) {

    }
}

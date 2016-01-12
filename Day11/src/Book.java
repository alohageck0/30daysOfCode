public class Book {
    // Properties, fields, global vars
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // whether or not is checked out
    int dayCheckedOut = -1;

    //Getters
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean isCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    //Setters
    private void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut, int dayCheckedOut) {
        this.isCheckedOut = checkedOut;
        setDayCheckedOut(dayCheckedOut);
    }

    //constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }

    //Getters

}

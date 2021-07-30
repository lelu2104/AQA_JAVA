public class Book {
    private int id;
    private String bookName;
    private String author;
    private int yearOfPublished;
    private int numberOfPages;
    private int price;
    private String typeOfbinding;

    public Book(int id, String bookName, String author, int yearOfPublished, int numberOfPages, int price, String typeOfbinding) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublished = yearOfPublished;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfbinding = typeOfbinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfbinding() {
        return typeOfbinding;
    }

    public void setTypeOfbinding(String typeOfbinding) {
        this.typeOfbinding = typeOfbinding;
    }
}
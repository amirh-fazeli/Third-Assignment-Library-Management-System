public class Book {
    //Book should contain name,author,year of publish and ISBN
    private String name;
    private String author;
    private int year;
    private String ISBN;

    Book(String name, String author, int year, String ISBN){
        this.name=name;
        this.author=author;
        this.year=year;
        this.ISBN=ISBN;
    };

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}

import java.lang.*;
public class Book {
    private String author;
    private String book_title;
    private int year;
    private String publisher;
    private int number_of_pages;
    public Book(String a, String b, int c, String d, int e)
    {
        author=a;
        book_title=b;
        year=c;
        publisher=d;
        number_of_pages=e;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setBook_title(String book_title)
    {
        this.book_title=book_title;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public void setPublisher(String publisher)
    {
        this.publisher=publisher;
    }
    public void setNumber_of_pages(int number_of_pages)
    {
        this.number_of_pages=number_of_pages;
    }
    public String getAuthor(String author)
    {
        return author;
    }
    public String getBook_title(String book_title)
    {
        return book_title;
    }
    public int getYear(int year)
    {
        return year;
    }
    public String getPublisher(String publisher)
    {
        return publisher;
    }
    public int getNumber_of_pages(int number_of_pages)
    {
        return number_of_pages;
    }
    public String toString() {
        return this.author+", " +this.book_title+", "+ this.year+", " + this.publisher+", " +this.number_of_pages;

    }
    }






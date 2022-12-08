package object;

class Book {
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle + ", " + bookNumber;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book(111, "개미");

        System.out.println(book);
        System.out.println(book.toString());

        /*String string = new String("test");
        System.out.println(string);
        System.out.println(string.toString());
        Integer integer = new Integer(1000);
        System.out.println(integer);
        System.out.println(integer.toString());*/
    }
}

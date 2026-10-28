import org.w3c.dom.ls.LSOutput;

public class TestBook {
    public static void main(String[] args) {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        Book book = new Book("Under the water", anAuthor, 30.4, 3);
        System.out.println(book);
        System.out.println(book.getPrice());
        System.out.println(book.getQtyInStock());
        Book anotherBook = new Book("more Java for dummy",
                new Author("Paquito Rovira", "paco@gmail.com", 'm'), 29.95, 888);

        System.out.println(anotherBook.getAuthor().getName());
        System.out.println(anotherBook.getAuthor().getEmail());

        Book[] books = new Book[5];
        books[0] = book;
        books[1] = anotherBook;
        books[2] = new Book("Paco el correa", new Author("Ugo Sorivex",
                "ugo@windows10.com", 'm'), 50.0, 200);
        books[3] = new Book("Ugo el caballo", new Author("Fabiolo Turras",
                "fabiolo@gmail.com", 'm'), 70.0, 150);
        books[4] = new Book("Andreu el hambriento", new Author("Paquito Rovirax",
                "pacolote@ubuntu.com", 'm'), 50.0, 100);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);

        }

    }
}

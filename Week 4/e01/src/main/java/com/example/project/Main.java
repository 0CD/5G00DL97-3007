public class Main {
    public static void main(String[] args) {
        // make a book object with some values
        Book book = new Book();
        book.setTitle("War and Peace");
        book.setAuthor("Leo Tolstoy");
        book.setPages(1225);
        // print book information
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPages());
        book.calculateReadingTime();

        // make a otherBook object with some values
        Book otherBook = new Book();
        otherBook.setTitle("Les Miserables");
        otherBook.setAuthor("Victor Hugo");
        otherBook.setPages(1462);
        // print otherBook information
        System.out.println(otherBook.getTitle());
        System.out.println(otherBook.getAuthor());
        System.out.println(otherBook.getPages());
        otherBook.calculateReadingTime();

        // make a otherOtherBook object with some values
        Book otherOtherBook = new Book();
        otherOtherBook.setTitle("Pride and Prejudice");
        otherOtherBook.setAuthor("Jane Austen");
        otherOtherBook.setPages(384);
        // print otherOtherBook information
        System.out.println(otherOtherBook.getTitle());
        System.out.println(otherOtherBook.getAuthor());
        System.out.println(otherOtherBook.getPages());
        otherOtherBook.calculateReadingTime();
    }
}
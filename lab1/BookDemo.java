package lab1;

public class BookDemo {
    public static void main(String[] args) {

        Book b = new Book("Developing Java Software","Russel Winder",79.75);
        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());

    }
}

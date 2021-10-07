package Book;

public class BookTest {
    public static void main(String[] args) {
        Book a1 = new Book("Zozulya Dmitriy", "djava", 300);
        System.out.println(a1);

        System.out.println(a1.getPage());

        a1.setAuthor("Dmitriy");
        System.out.println(a1);
    }
}

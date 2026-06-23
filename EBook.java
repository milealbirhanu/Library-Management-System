public class EBook extends Book {

    public EBook(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public void display() {
        System.out.println("E-Book Information");
        super.display();
    }
}

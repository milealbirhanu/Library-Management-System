public class Main {

    public static void main(String[] args) {

        try {

            Book b1 =
                new Book(1,
                        "Java Programming",
                        "John");

            Book b2 =
                new EBook(2,
                         "Advanced Java",
                         "Smith");

            b1.display();
            b2.display();

            FileManager.saveBook(b1);
            FileManager.saveBook(b2);

            int quantity = -5;

            if(quantity < 0) {
                throw new InvalidBookException(
                        "Quantity cannot be negative");
            }

        } catch(InvalidBookException e) {

            System.out.println(
                    "Custom Exception: "
                    + e.getMessage());

        } finally {

            System.out.println(
                    "Program Finished");
        }
    }
}

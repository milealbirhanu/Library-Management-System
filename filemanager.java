import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveBook(Book book) {

        try {
            FileWriter fw = new FileWriter("books.txt", true);

            fw.write(book.getId() + ","
                    + book.getTitle() + ","
                    + book.getAuthor() + "\n");

            fw.close();

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

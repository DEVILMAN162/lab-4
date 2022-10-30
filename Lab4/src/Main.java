import java.io.IOException;
import java.time.LocalDate;
import java.util.ConcurrentModificationException;
import java.util.Locale;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException, ConcurrentModificationException {
        //Book b1 = new Book("B2394","Physics","Albert Einstein","Princeton University",10);
        Book b2 = new Book("B2394","Physics","Albert Einstein","Princeton University",2);
        BookDatabase d1 = new BookDatabase("Book.txt");
        LocalDate l = new LocalDate(2022,12,2);
        StudentBook s1 = new StudentBook("7845,"B2568", l);

        )
        //d1.readFromFile();
        //d1.insertRecord(b1);
        //d1.saveToFile();
        //d1.insertRecord(b2);
        //d1.saveToFile();
//        d1.readFromFile();
//        Book book =(Book) d1.returnAllRecords().get(0);
//        book.setQuantity(book.getQuantity()+1);
//        d1.saveToFile();
        System.out.println(LocalDate.now());

        System.out.println(d1.returnAllRecords());










    }
}
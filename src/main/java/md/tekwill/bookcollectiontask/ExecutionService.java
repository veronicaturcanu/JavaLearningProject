package md.tekwill.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {

    public static void main(String[] args) {
        Book mihaisBook = new Book("Atomic Habits", "J. Clear");
        Book alexsBook = new Book("Crime and Punishment", "F. Dostoevsky");
        Book ruxandasBook = new Book("The Brothers Karamazov", "F. Dostoevsky");
        Book veronicasBook = new Book("To Kill a Mockingbird", "H. Lee");
        Book mihais2Book = new Book("1984", "G. Orwell");

        mihaisBook.printTheBookDetais();
        alexsBook.printTheBookDetais();
        ruxandasBook.printTheBookDetais();
        veronicasBook.printTheBookDetais();
        mihais2Book.printTheBookDetais();

        Library carturestiLibrary = new Library("Carturesti");
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(veronicasBook);
        carturestiLibrary.addBook(ruxandasBook);

        System.out.println("Numarul total de carti in libraria " + carturestiLibrary.getLibraryName() +
                " este " + carturestiLibrary.getTheStockStatusNumber());

        System.out.println("Exista in libraria " + carturestiLibrary.getLibraryName() + " cartea " +
                alexsBook.getTitle() + "? " + carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.addBook(alexsBook);

        System.out.println("Exista in libraria " + carturestiLibrary.getLibraryName() + " cartea " +
                alexsBook.getTitle() + "? " + carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.deleteABookIfExists(mihais2Book);
        carturestiLibrary.deleteABookIfExists(alexsBook);
        carturestiLibrary.deleteABookIfExists(veronicasBook);

        System.out.println("Numarul total de carti in libraria " + carturestiLibrary.getLibraryName() +
                " este " + carturestiLibrary.getTheStockStatusNumber());

        carturestiLibrary.printAllTheBook();

        Library victorsLibrary = new Library("Cartier");

        victorsLibrary.addBook(alexsBook);
        victorsLibrary.addBook(mihais2Book);
        System.out.println("Numarul total de carti in libraria " + victorsLibrary.getLibraryName() +
                " este " + victorsLibrary.getTheStockStatusNumber());

        Map<String, Library> librariesMap = new HashMap<>();
        System.out.println("Map manipulations ↓↓↓");

        librariesMap.put("Str. Stefan cel Mare 64", carturestiLibrary);
        librariesMap.put("Bd. Dacia 50, ap.45", victorsLibrary);

        librariesMap.get("Str. Stefan cel Mare 64").printAllTheBook();
        System.out.println(librariesMap.get("Str. Stefan cel Mare 64").isThereSuchABookInTheStock(veronicasBook));

        int[] dataTable = {34, 1, 43, 65, 77, 900};
        System.out.println("arrayTable manipulations ↓↓↓");

        IntNumberArrayService.printAllValues(dataTable);

        System.out.println("Numarul minim din sirul propus este: " + IntNumberArrayService.findMin(dataTable));

        System.out.println("Media din sirul propus este: " + IntNumberArrayService.findMed(dataTable));
    }
}

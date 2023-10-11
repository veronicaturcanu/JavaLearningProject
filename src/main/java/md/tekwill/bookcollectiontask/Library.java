package md.tekwill.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> libraryStock;

    private String libraryName;

    public Library (String name){
        libraryName = name;
        libraryStock = new ArrayList<>();
    }

    public void addBook(Book bookElement){
        if (libraryStock.add(bookElement)) {
            System.out.println("The book " + bookElement.getTitle() + " has been added to library " + libraryName);
        } else {
            System.out.println("The book " + bookElement.getTitle() + " has not been added to library " + libraryName);
        }
    }

    public String getLibraryName(){
        return libraryName;
    }

    public int getTheStockStatusNumber(){
        return libraryStock.size();
    }

    public boolean isThereSuchABookInTheStock(Book book){
        return libraryStock.contains(book);
    }

    public void deleteABookIfExists(Book book){
        if (libraryStock.remove(book)){
            System.out.println("The book " + book.getTitle() + " has been bought from " + libraryName);
        } else {
            System.out.println("The book " + book.getTitle() + " does not exists in " + libraryName);
        }
    }

    public void printAllTheBook(){
        System.out.println("Cartile din libraria " + libraryName + " sunt:");
        for (int i = 0; i< libraryStock.size(); i++){
            libraryStock.get(i).printTheBookDetais();
        }
    }

}

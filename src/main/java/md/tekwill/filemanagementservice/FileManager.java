package md.tekwill.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static boolean createTheFileIfItDoesNotExist(File file) {
        try {
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void informalIfTheFileExists(File file){
        if (file.exists()){
            System.out.println("The file is present");
        } else {
            System.out.println("The file is not present");
        }
    }

    public static void printTheFileName(File fileThatIsConsidered){
        System.out.println("File name: " + fileThatIsConsidered.getName());
    }

    public static void printTheAbsolutePath(File fileThatIsConsidered){
        System.out.println("The absolute path: " + fileThatIsConsidered.getAbsolutePath());
    }

    public static void printIfItIsADirectoryOrAFile(File file){
        if (file.isDirectory()) {
            System.out.println("It is a Directory");
        } else if (file.isFile()){
            System.out.println("It is a File");
        }
    }

    public static void deleteTheFileIfExists(File file){
        if (file.delete()) {
            System.out.println("The file was deleted");
        } else {
            System.out.println("The file could not be deleted");
        }
    }
}

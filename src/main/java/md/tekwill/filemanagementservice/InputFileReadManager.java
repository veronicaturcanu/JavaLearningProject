package md.tekwill.filemanagementservice;

import java.io.*;
import java.nio.file.Files;

public class InputFileReadManager {

    public static void printDataOnTheConsoleUsingFileReader(File file){
        FileReader fileReaderObj = null;

        try {
            fileReaderObj = new FileReader(file);

            int character;
            while ((character = fileReaderObj.read()) != -1){
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReaderObj != null)
                    fileReaderObj.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printDataFromAFileUsingBufferedReader (File file){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printDataFromFileUsingFiles(File file){
        try {
            System.out.println(Files.readString(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

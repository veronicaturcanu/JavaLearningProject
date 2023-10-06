package md.tekwill.filemanagementservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {

    public static void writeInformationIntoAFileUsingFileWriter(String filePath, String content) {
        FileWriter fileWriterObject = null;

        try {
            fileWriterObject = new FileWriter(filePath);
            fileWriterObject.write(content);
        } catch (IOException exceptionObject) {
            System.out.println("There is an exception during writing: ");
            exceptionObject.printStackTrace();
        } finally {
            try {
                if (fileWriterObject != null)
                    fileWriterObject.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    public static void writeInformationIntoFileUsingBufferedWriter(String filePath, String content){
        BufferedWriter bufferedWriterObject = null;

        try {
            bufferedWriterObject = new BufferedWriter(new FileWriter(filePath));
            bufferedWriterObject.write(content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedWriterObject != null)
                    bufferedWriterObject.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

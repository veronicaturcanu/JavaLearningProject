package md.tekwill.filemanagementservice;

import java.io.File;

public class FileTaskExecution {

    public static void main(String[] args) throws Exception{
        File fileObject = new File("src/main/java/md/tekwill/filemanagementservice/test.txt");

        FileManager.informalIfTheFileExists(fileObject);
        System.out.println(FileManager.createTheFileIfItDoesNotExist(fileObject));
        FileManager.informalIfTheFileExists(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.printTheAbsolutePath(fileObject);
        FileManager.printIfItIsADirectoryOrAFile(fileObject);
        //FileManager.deleteTheFileIfExists(fileObject);

        String filePath = "src/main/java/md/tekwill/filemanagementservice/testOutput.txt";
        OutputFileWriterManager.writeInformationIntoAFileUsingFileWriter(filePath,"Content nr1");
        //OutputFileWriterManager.writeInformationIntoFileUsingBufferedWriter(filePath,"content nr2");

        File fileObjectUsedForReading = new File(filePath);
        InputFileReadManager.printDataFromAFileUsingBufferedReader(fileObjectUsedForReading);
        InputFileReadManager.printDataFromFileUsingFiles(fileObjectUsedForReading);
        InputFileReadManager.printDataOnTheConsoleUsingFileReader(fileObjectUsedForReading);
    }
}

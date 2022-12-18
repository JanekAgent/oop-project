import java.io.File;
import java.io.FileWriter;   
import java.io.IOException;  

public class WriteFile {
    String fileName;
    String text;
    void Write(String text){
    try {
        FileWriter myWriter = new FileWriter(fileName);
        myWriter.write(text);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
    WriteFile(String fileName){
        this.fileName=fileName;
    }
  }
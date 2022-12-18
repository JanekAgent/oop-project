
import java.io.FileWriter;   
import java.io.IOException;  

public class WriteFile {
    String fileName;
    String text;
    Boolean append;
    void Write(String text){
    try {
        FileWriter myWriter = new FileWriter(fileName,append);
        myWriter.write(text);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
    WriteFile(String fileName,Boolean appendl){
        this.fileName=fileName;
        this.append=appendl;
    }
  }
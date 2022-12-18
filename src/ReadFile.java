import java.util.ArrayList;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class ReadFile {
    String fileName;
    ArrayList<book> loadBooks(Library library){
        ArrayList<book> arr = new ArrayList<>();
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String[] bookData = data.split(";");
              int idl=Integer.valueOf(bookData[0]);
              int yearl=Integer.valueOf(bookData[3]);
              int editionl=Integer.valueOf(bookData[4]);
              int authorID=Integer.valueOf(bookData[5]);
              arr.add(new book(idl, library, data, yearl, editionl, authorID));
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        return arr;
    }

    ReadFile(String fileNamel){
        this.fileName=fileNamel;
        
    }
  
  }


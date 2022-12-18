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
              String titlel = bookData[1];
              int yearl=Integer.valueOf(bookData[2]);
              int editionl=Integer.valueOf(bookData[3]);
              System.out.println(bookData[4]);
              int authorID=Integer.valueOf(bookData[4]);
              arr.add(new book(idl, library,titlel , yearl, editionl, authorID));
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        return arr;
    }
    String loadLine(){
      String data="";
      try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      data = myReader.nextLine();
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      return data;
    }
    ReadFile(String fileNamel){
        this.fileName=fileNamel;
        
    }
  
  }


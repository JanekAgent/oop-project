import java.util.ArrayList;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;

import javax.print.attribute.standard.Copies; 

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
    ArrayList<Copy> loadCopies(Library library){
      ArrayList<Copy> arr = new ArrayList<>();
      try {
          File myObj = new File(fileName);
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] copyData = data.split(";");
            int idl=Integer.valueOf(copyData[0]);
            int bookIDl=Integer.valueOf(copyData[1]);            
            
            boolean alivel=Boolean.valueOf(copyData[2]);
            Date dayOfAddedl = new Date(copyData[3]);
            Date dayOfDeathl = new Date(copyData[4]);
            boolean lentedl=Boolean.valueOf(copyData[5]);
            int userIDl =Integer.valueOf(copyData[6]);            
            Date dateOfLentl =new Date(copyData[7]);
            String commentl =copyData[8];
            arr.add(new Copy(bookIDl,idl, alivel, dayOfAddedl, dayOfDeathl, lentedl,userIDl, dateOfLentl, commentl));
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
    
    void reloadFile(ArrayList<Copy> copies){
     WriteFile wf =   new WriteFile("copies.txt", false);
     wf.Write("");
     for (Copy i : copies){
      i.writeDataToFile();
     }
    }
    
  
  }


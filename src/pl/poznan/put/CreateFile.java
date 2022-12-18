package pl.poznan.put;


import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
    String fileName;
    public  void Create(){
    try {
      File myObj = new File(fileName);
      if (myObj.createNewFile()) {
        System.out.println("File not finded created new: " + myObj.getName());
      } else {
        System.out.println("Located file");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }}
    public CreateFile(String fileNamel){
        this.fileName=fileNamel;
    }
  }

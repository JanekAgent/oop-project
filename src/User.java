import java.util.ArrayList; 
import java.util.Scanner;


public class User {
    int id;

    String name;
    String surname;
    Date bornDate;
    String adress;
    String email;
    ArrayList<book> borrowedBooks;
    User(ArrayList<User> usersl){
        System.out.println("Adding user");
        this.id=usersl.size();
        Scanner input = new Scanner(System.in); 
        System.out.print("Name: ");
        this.name= input.nextLine();
        System.out.print("Surname: ");     
        this.surname = input.nextLine();   
        System.out.print("Borndate: ");
        String tempDate= input.nextLine();
        this.bornDate = new Date(tempDate);
        System.out.print("Adress: ");
        this.adress = input.nextLine();
        System.out.print("E-mail adress: ");
        this.email = input.nextLine();
        input.close();
        writeDataToFile();
    }
    User(int idl,String namel,String surnamel,Date bornDatel,String adressl,String emaill){
        this.id=idl;
        this.name=namel;
        this.surname=surnamel;
        this.bornDate=bornDatel;
        this.adress=adressl;
        this.email=emaill;

    }
    void writeDataToFile(){
        String f="users.txt";
        WriteFile file= new WriteFile(f,true);
        
        file.Write(dataForFile());
    }
    String dataForFile(){
        String data;
        data="";
        data+=Integer.toString(id);
        data+=";";
        data+=name;
        data+=";";
        data+=surname;
        data+=";";
        data+=bornDate.dateToString();
        data+=";";
        data+=adress;
        data+=";"; 
        data+=email;
          
        data+="\n";
        return data;
        
    }
    void printInformation(){
        System.out.println("Id: "+Integer.toString(id));
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Date of born"+bornDate.dateToString());
        System.out.println("Adress: "+adress);
        System.out.println("E-mail: "+email);
        
    }
}

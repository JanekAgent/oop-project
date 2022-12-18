import java.util.ArrayList;
import java.util.Scanner;
 
public class Copy {
    book book;
    int bookID;
    int id;

    boolean alive;
    Date dayOfAdded;
    Date dayOfDeath;
    boolean lented;

       
    User lentedTo;
    int userID;
    Date dateOfLent;
    String comment;
    
    
    Copy(Library libraryl,ArrayList<Copy> copiesl,ArrayList<book> books){
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Book id: ");
        this.bookID= input.nextInt();
        IdSearch serch = new IdSearch(bookID);
        this.book=serch.book(books);
        this.id= copiesl.size()+1;
        this.alive=true;
        this.dayOfDeath=new Date("0000/00/00");
        this.dateOfLent=new Date("0000/00/00");
        CurrentDate currentDate = new CurrentDate();
        this.dayOfAdded=currentDate.actualDate();
        writeDataToFile();
        
        
    }
    Copy(int bookIDl,int idl,boolean alivel,Date dayOfAddedl,Date dayOfDeathl,boolean lentedl,int userIDl,Date dateOfLentl,String commentl){
        this.bookID= bookIDl;
        this.id= idl;
        this.alive=alivel;
        this.dayOfAdded=dayOfAddedl;
        this.dayOfDeath=dayOfDeathl;
        this.lented=lentedl;
        this.userID=userIDl;
        this.dateOfLent=dateOfLentl;
        this.comment=commentl;
    }
    Copy(book book,int id){       
        
        this.bookID= book.id;
        this.id=id;
        this.alive=true;
        this.dayOfDeath=new Date("0000/00/00");
        this.dateOfLent=new Date("0000/00/00");
        CurrentDate currentDate = new CurrentDate();
        this.dayOfAdded=currentDate.actualDate();
        writeDataToFile();
    }
    Copy CopyOfCopy(int id){
        Copy newCopy = new Copy(this.book,id);
        return newCopy;
    }
    void Lent(ArrayList<Copy> copies){
        if (alive){
            if (lented){
                System.out.println("It's arleady lented");
                

                

            
            }
            else{
                Scanner input = new Scanner(System.in); 
                System.out.print("Id of reader: ");
                this.userID = input.nextInt();
                lented=true;
                ReadFile rf = new ReadFile("copies.txt");
                rf.reloadFile(copies);
            }
        }else {
            System.out.println("It's destroyed and not avalible to lent");
        }
    
    }
    void returnCopy(){
        if (alive){
            if (lented=true){
                Scanner input = new Scanner(System.in); 
                
                this.userID = 0;
                lented=false;
                System.out.print("Copy returned ");
                

            
            }
            else{
                System.out.println("It's arleady lented");
            }
        }else {
            System.out.println("It's destroyed and not avalible to lent");
        }
    }
    void writeDataToFile(){
        String f="copies.txt";
        WriteFile file= new WriteFile(f,true);
        
        file.Write(dataForFile());
    }
    String dataForFile(){
        String data;
        data="";
        data+=Integer.toString(id);
        data+=";";
        data+=Integer.toString(bookID);;
        data+=";";
        data+=Boolean.toString(alive);
        data+=";";
        data+=dayOfAdded.dateToString();
        data+=";";
        data+=dayOfDeath.dateToString();
        data+=";";
        data+=Boolean.toString(lented);
        data+=";";
        data+=Integer.toString(userID);
        data+=";";
        data+=dateOfLent.dateToString();
        data+=";";
        data+=comment;    
        data+="\n";
        return data;
        
    }
    void printInformation(ArrayList<book> books){
        System.out.print("Copy ID:");
        System.out.println(id);
        System.out.print("Lented: ");
        System.out.println(Boolean.toString(lented));
        System.out.print("Book information:");
        IdSearch search = new IdSearch(bookID);
        this.book=search.book(books);
        book.printInformation();

        
    }
    
   
    }

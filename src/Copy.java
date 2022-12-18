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
    
    void Copy(){
        
    }
    Copy(Library libraryl,ArrayList<Copy> copiesl){
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Book id: ");
        this.bookID= input.nextInt();
        
        this.id= copiesl.size()+1;
        this.alive=true;
        CurrentDate currentDate = new CurrentDate();
        this.dayOfAdded=currentDate.actualDate();
        
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
        CurrentDate currentDate = new CurrentDate();
        this.dayOfAdded=currentDate.actualDate();
    }
    Copy CopyOfCopy(int id){
        Copy newCopy = new Copy(this.book,id);
        return newCopy;
    }
    void Lent(){
        if (alive){
            if (lented=false){
                Scanner input = new Scanner(System.in); 
                System.out.print("Id of reader: ");
                this.userID = input.nextInt();
                lented=true;
                

            
            }
            else{
                System.out.println("It's arleady lented");
            }
        }else {
            System.out.println("It's destroyed and not avalible to lent");
        }
    
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
    }

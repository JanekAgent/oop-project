import java.util.ArrayList; 
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.Year;   
public class Application{
    public static void main(String[] args){
        System.out.println("Start");
        System.out.println("Start loading");
        Scanner input = new Scanner(System.in); 
        ArrayList<book> books = new ArrayList<>();
        //book[] books={};
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Author> authors = new ArrayList<>();
        Author testAuthor = new Author();
            
        //Load rules
        Library library = new Library();
        Rules rules = new Rules();


        //Load date
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        // LocalDateTime now = LocalDateTime.now();  
        // Date currentDate = new Date();
        //Load data
        //Load books
        //Load users
        //Interact with user
        System.out.println("Loaded, start using");
        while (2>1){
            String inputed= input.nextLine(); 
            //System.out.println(inputed);
            if (inputed.equals("Add book")){
                //int yearl=0;
                //int editionl=0;
                System.out.println("Adding book");
                
                System.out.print("Title: ");
                String title= input.nextLine();
                System.out.print("Year: ");
                
                
                int yearl = input.nextInt();
                System.out.print(yearl);
                

                System.out.print("Editon: ");

                
                int editionl = 123;
                

                System.out.print("Author: ");
                


                books.add( new book(library, title, yearl, editionl, testAuthor));
                System.out.println("Bookadded");
            }

            if (inputed.equals("Add Author")){
                System.out.println("Adding Author");
            }
            if (inputed.equals("Lent")){
                System.out.println("Adding book");
            }
            if (inputed.equals("Exit")){
                break;
            }
        }
        System.out.println("Goodbye");
    }
}
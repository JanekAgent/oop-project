import java.util.ArrayList; 
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.Year; 
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files  
public class Application{
    public static void main(String[] args){
        System.out.println("Start");
        System.out.println("Start loading");
        Scanner input = new Scanner(System.in); 
        
        //book[] books={};
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Author> authors = new ArrayList<>();
        Author testAuthor = new Author();
            
        //Load rules
        ;
        Library library = new Library("library.txt");
        Rules rules = new Rules();



        //Load date
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        // LocalDateTime now = LocalDateTime.now();  
        // Date currentDate = new Date();


        //load authors
        //Load books

        CreateFile file = new CreateFile("books.txt");
        file.Create();
        ReadFile booksFile = new ReadFile("books.txt");
        ArrayList<book> books=booksFile.loadBooks(library);
        //load copies
        //Load users
        //Interact with user
        System.out.println("Loaded, start using");
        while (2>1){
            String inputed= input.nextLine(); 
            //System.out.println(inputed);
            if (inputed.equals("Add book")){
                System.out.println("Adding book");
                System.out.println(library.lastBook());
                books.add(new book(library));
                System.out.println(library.lastBook());
                books.get(books.size()-1).writeDataToFile();
                System.out.println("Book added");
            }

            if (inputed.equals("Add Author")){
                System.out.println("Adding Author");
            }
            if (inputed.equals("Lent")){
                System.out.println("Adding book");
            }
            if (inputed.equals("Search book")){
                System.out.print("Id: ");               
                int id = input.nextInt();
                books.get(id).printImformation();
            }

            if (inputed.equals("Exit")){
                break;
            }
            if (inputed.equals("All books")){
                for (book i : books){
                    i.printImformation();

                }
            }
        }
        System.out.println("Goodbye");

    }
}
import java.util.ArrayList; 
import java.util.Scanner;

public class Application{
    public static void main(String[] args){
        System.out.println("Start");
        System.out.println("Start loading");
        Scanner input = new Scanner(System.in); 
        
        //book[] books={};
        //ArrayList<User> users = new ArrayList<>();
        ArrayList<Author> authors = new ArrayList<>();
        Author testAuthor = new Author();
            
        //Load rules
        ;
        Library library = new Library("library.txt");
        Rules rules = new Rules();



        

        //load authors
        //Load books

        CreateFile file = new CreateFile("books.txt");
        file.Create();
        ReadFile booksFile = new ReadFile("books.txt");
        ArrayList<book> books=booksFile.loadBooks(library);
        //load copies
        CreateFile copiesFile = new CreateFile("copies.txt");
        copiesFile.Create();
        ReadFile copiesFileRead = new ReadFile("copies.txt");
        ArrayList<Copy> copies=copiesFileRead.loadCopies(library);

        //Load users
        // CreateFile ufile = new CreateFile("users.txt");
        // ufile.Create();
        //ReadFile userReadFile = new ReadFile("users.txt");
        //ArrayList<Copy> users=userReadFile.loadUsers(library);
        //Interact with library man
        System.out.println("Loaded, start using");
        while (2>1){
            System.out.print(">");
            String inputed= input.nextLine(); 
            //System.out.println(inputed);
            if (inputed.equals("Add book")){
                System.out.println("Adding book");
                System.out.println(library.lastBook());
                books.add(new book(library,books.size()));
                System.out.println(library.lastBook());
                books.get(books.size()-1).writeDataToFile();
                System.out.println("Book added");
            }
            if (inputed.equals("Add copy")){
                System.out.print("Number of copies: ");
                int numberOfCopies = input.nextInt();
                Copy firstCopy = new Copy(library, copies,books);
                copies.add(firstCopy);
                for (int i=0;i<numberOfCopies;i++){
                    copies.add(firstCopy.CopyOfCopy(copies.size()));

                }
                System.out.println("Copies added");
            }


            if (inputed.equals("Add Author")){
                System.out.println("Adding Author");
            }
            if (inputed.equals("Lent copy")){
                System.out.print("Copy ID:");
                int id =input.nextInt();  
                copies.get(id).Lent(copies);
            }
            if (inputed.equals("Return copy")){
                System.out.print("Copy ID:");


            }
            if (inputed.equals("Search book")){
                System.out.print("Id: ");               
                int id = input.nextInt();
                books.get(id).printInformation();
            }
            
            if (inputed.equals("Exit")){
                break;
            }
            if (inputed.equals("All books")){
                for (book i : books){
                    System.out.println("-----------------------------"); 
                    i.printInformation();

                }
            }
            if (inputed.equals("All copies")){
                for (Copy i : copies){
                    System.out.println("-----------------------------"); 
                    i.printInformation(books);

                }
            }
            
        }
        input.close();
        System.out.println("Goodbye");

    }
}
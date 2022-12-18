import java.util.Scanner;
public class book {
    Library library;
    String title;
    int id;
    int year;
    int edition;
    int authorID;
    Author author;
    String data;
    public
    book(Library libraryl,String titlel,int yearl,int editionl,int authorl){
        this.library=libraryl;
        this.title=titlel;
        this.year=yearl;
        this.edition=editionl;
        this.authorID=authorl;
        this.id =library.maxid;
    }
    book(int idl,Library libraryl,String titlel,int yearl,int editionl,int authorl){
        this.library=libraryl;
        this.title=titlel;
        this.year=yearl;
        this.edition=editionl;
        this.authorID=authorl;
        this.id =idl;
    }
    book(Library libraryl){
        this.library=libraryl;
        Scanner input = new Scanner(System.in); 
        System.out.print("Title: ");
        this.title= input.nextLine();
        System.out.print("Year: ");     
        this.year = input.nextInt();   
        System.out.print("Editon: ");
        this.edition = input.nextInt();
        System.out.print("AuthorID: ");
        this.authorID = input.nextInt();
        library.newBook();
    }
    void writeDataToFile(){
        String f="books.txt";
        WriteFile file= new WriteFile(f);
        file.Write(dataForFile());
    }
    void printImformation(){
        System.out.println("Book: "+title);
                
        System.out.print("Title: ");
    }
    String dataForFile(){
        data="";
        data+=Integer.toString(id);
        data+=";";
        data+=title;
        data+=";";
        data+=Integer.toString(year);
        data+=";";
        data+=Integer.toString(edition);
        data+=";";
        data+=Integer.toString(authorID);
        return data;
        
    }
}

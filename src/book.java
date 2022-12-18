import java.util.Scanner;
public class book {
    Library library;
    String title;
    int id;
    int year;
    int edition;
    int authorID;
    String author;
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
    book(Library libraryl,int idl){
        this.id=idl;
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
        input.close();
    }
    void writeDataToFile(){
        String f="books.txt";
        WriteFile file= new WriteFile(f,true);
        
        file.Write(dataForFile());
    }
    void printInformation(){
        System.out.println("Book: "+title);
        System.out.println("Id: "+Integer.toString(id));  
        System.out.println("Year: "+Integer.toString(year));
        System.out.println("Edition: "+Integer.toString(edition));
        System.out.println("Author ID: "+Integer.toString(authorID));
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
        data+="\n";
        return data;
        
    }
}

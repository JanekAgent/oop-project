
public class book {
    Library library;
    String title;
    int id;
    int year;
    int edition;
    int authorID;
    Author author;
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
    void writeDataToFile(){
        String f="books.txt";

    }
    void printImformation(){
        System.out.println("Book: "+title);
                
        System.out.print("Title: ");
    }

    
}

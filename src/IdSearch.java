import java.util.ArrayList; 
public class IdSearch {
    int id;
    IdSearch(int idl){
        this.id=idl;
    }
    book book(ArrayList<book> booksl){
        return booksl.get(id);
    }
    Copy Copy(ArrayList<Copy> Copysl){
        return Copysl.get(id);
    }
}

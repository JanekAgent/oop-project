import java.util.ArrayList; 


public class User {
    int id;
    int code;
    String name;
    String surname;
    Date bornDate;
    String adress;
    String email;
    ArrayList<book> borrowedBooks;
    User(ArrayList<User> usersl){
        System.out.println("Adding user");
    }

}

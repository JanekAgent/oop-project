import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class CurrentDate {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
    CurrentDate(){     
        }
    
    Date actualDate(){
        LocalDateTime now = LocalDateTime.now();  
        
        String b =dtf.format(now);
        String[] a =b.split("/");
        Date date = new Date(Integer.valueOf(a[0]), Integer.valueOf(a[1]), Integer.valueOf(a[2]));
        return date;
    }
}

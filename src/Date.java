
public class Date {
    int day;
    int month;
    int year;
    Date(int yearl,int monthl,int dayl){
        this.day=dayl;
        this.month=monthl;
        this.year=yearl;
    }
    Date(String datel){
        String[] dateListed = datel.split("/");
        this.year=Integer.valueOf(dateListed[0]);
        this.month=Integer.valueOf(dateListed[1]);
        this.day=Integer.valueOf(dateListed[2]);
    }
    String dateToString(){
        String str;
        str=Integer.toString(year)+"/"+Integer.toString(month)+"/"+Integer.toString(day);
        return str;
    }
}

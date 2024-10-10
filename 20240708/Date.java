public class Date {
    int year, month, date;
    public Date () {}
    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }
    @Override
    public String toString(){
        return this.year + "-" + this.month + "-" + this.date;
    }
}
class Date2 extends Date{

    public Date2(int year, int month, int date) {
        super(year, month, date);
    }
    
}
class Test{
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(2000,1,1);
        System.out.println(date1);
        System.out.println(date2);
    }
}

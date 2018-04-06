// Tran Thuy Kieu
// Exercise 3.4

public class ex34 {
    
    public static void printAmerican(String date, int day, String month, int year){
        System.out.println("American format: ");
        System.out.println(String.format("%s, %s %s, %s",date, month, day, year));
    }
    
    public static void printEuropean(String date, int day, String month, int year){
        System.out.println("Enropean format: ");
        System.out.println(String.format("%s %s %s, %s", date, day, month,year));
    }
    
    public static void main(String[] args) {
        
        String  date = "Thursday",
        month = "April";
        
        int     day = 5,
        year = 2018;
        
        printAmerican(date, day, month, year);
        System.out.println("");
        printEuropean(date, day, month, year);
        
    }
}





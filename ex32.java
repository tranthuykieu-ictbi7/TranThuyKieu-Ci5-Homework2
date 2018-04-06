// Tran Thuy Kieu
// ex3.2
public class ex32 {
    public static void zoop(){
        baffle();
        System.out.print("You wugga ");
        baffle();
    }
    
    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }
    
    public static void baffle(){
        System.out.print("wug");
        ping();
    }
    
    public static void ping(){
        System.out.println(".");
    }
}

//Ex3.1:
//1. Run the program and we can see the output
//2. After the method ping is called, output: "No, I wug."


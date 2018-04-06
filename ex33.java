// Tran THuy Kieu
// Exercise 3.3

public class ex33 {
    public static void zool(int number, String namePet, String street){
        System.out.println("The number: " + number);
        System.out.println("Name of the first pet: " + namePet);
        System.out.println("The street you grew up: " + street);
    }
    public static void main(String[] args) {
        
        
        int number = 11;
        String namePet = "Kiki";
        String street = "Hoang Quoc Viet";
        
        zool(number, namePet, street);
    }
}


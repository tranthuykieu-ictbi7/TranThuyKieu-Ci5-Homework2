// Tran Thuy Kieu
// Ex 12.5

import java.util.Scanner;

public class ex125 {
    public static boolean areFactoes(int n, int[] array){
        boolean check = true;
        for (int i = 0; i < array.length; i++){
            if (n % array[i] != 0) return false;
        }
        return check;
    }
    
    public static void main(String[] args) {
        
        Scanner keyboardScanner = new Scanner(System.in);
        
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print("a[" + i + "] = ");
            array[i] = keyboardScanner.nextInt();
        }
        System.out.print("Enter n: ");
        int n = keyboardScanner.nextInt();
        System.out.println("n is divisible by all the element of the array, true or false ?");
        System.out.println(areFactoes(n, array));
        
    }
}


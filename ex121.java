import java.util.Scanner;

public class ex121 {
    public  static int[] cloneArray(int[] oldArray){
        int n = oldArray.length;
        int[] newArray = new int[n];
        
        for(int i = 0; i < n; i++){
            newArray[i] = oldArray[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        
        int[] oldArray = new int[100];
        System.out.print("Number of elements of the array: ");
        int n = keyboardScanner.nextInt();
        
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            System.out.print("oldArray[" + i + "] = ");
            oldArray[i] = keyboardScanner.nextInt();
        }
        cloneArray(oldArray);
    }
}


import java.util.Random;

public class ex123 {
    public static void randomInt(int low, int high){
        int n = (int)(Math.random() * (high - low)) + low;
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        int low = 1, high = 3;
        randomInt(low, high);
    }
    
}


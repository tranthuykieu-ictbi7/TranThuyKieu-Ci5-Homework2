// Tran Thuy Kieu
// Ex 12.2

public class ex122 {
    public static void randomDouble(double low, double high){
        double n = (Math.random() * (high - low - 0.1)) + low;
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        double low = 1.4, high = 9.7;
        randomDouble(low, high);
    }
}


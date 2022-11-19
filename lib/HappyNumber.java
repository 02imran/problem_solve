public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        int sum = 0;
        boolean happyNumber = false;

        while (n > 0) {
            sum = n%10;
            n = n / 10;
        }
        
    }
    
}

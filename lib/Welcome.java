
import java.util.Arrays;
import java.util.List;

public class Welcome {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 5;
        // int list[] = { 5,6,9,12,18};
        int cumulative = 0;
        int shared = 5;
        
        for(int i = 1; i <= n; i++) {
            cumulative += shared / 2;
            shared = shared / 2 * 3;
            System.out.println(cumulative);
            // System.out.println(shared);
        }
        
        
      

            
        
    }
    
}

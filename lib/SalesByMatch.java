import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SalesByMatch {
    public static void main(String[] args) {
        int n = 7;
        List<Integer> ar = new ArrayList<Integer>();
        while(n>0){
            Collections.addAll(ar, 10, 20, 20, 10, 10, 30, 50);
        }

        
        sockMerchant(n, ar);
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
            int qttyOfSameColorPairs = 0;
            
            
            Collections.sort(ar);
            System.out.println(ar);
            
            for(int i = 0; i < n -1; i++) {            
                int current = ar.get(i);
                int next = ar.get(i + 1);
                
                
                if(current == next) {
                    qttyOfSameColorPairs++;
                    i++; // Jump
                    System.out.println(qttyOfSameColorPairs);
                }
                
            }
            
            return qttyOfSameColorPairs;
        }
}

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PlusOne {
    public static void main(String[] args) {
        int count = 1;
        int[] digits={7,2,6};
        
        Integer plusOne = 0;
        int lastIndex = digits.length-1;
        for(int i=lastIndex; i>=0;i--){
            digits = digits[0]+1;
            System.out.println(digits);
        }
        System.out.println(plusOne);
    }
    
}

import java.util.HashMap;
import java.nio.file.SimpleFileVisitor;
import java.util.*;

public class DuplicateArrayTwo {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,1,2,3};
        Integer k = 2;
        boolean isDuplicate = false;
        int i = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
    
        for( i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k){
                    isDuplicate = true;
                }
            }
            map.put(nums[i],i);
        }
            

        

    }
    
}

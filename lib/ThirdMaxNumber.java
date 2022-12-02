import java.util.HashMap;
import java.util.*;  
import java.util.Arrays;
import java.util.HashSet;
public class ThirdMaxNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], null);
        }
        HashSet<Integer> setDataToHashSet = new HashSet<Integer>();
        setDataToHashSet.addAll(map.keySet());
        List<Integer> list = new ArrayList<Integer>(setDataToHashSet);
        Collections.sort(list);
        if(list.size()<3){
            result = list.get(list.size()-1);
            
        }else{
            result = list.get(list.size()-3);
            System.out.println(result);
        }

    }
    
}

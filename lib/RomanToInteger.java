
import java.util.Arrays;
import java.util.HashMap; import java.util.Map;
import java.util.Set;
public class RomanToInteger {
    public static void main(String[] args) {

        String s = "IV";
        int answer = 0, prev = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            for(int i = 0; i<s.length(); i++){
                if(entry.getKey()== s.charAt(i)){
                    answer += entry.getValue();
                    System.out.println(answer);
                }
            }
        }
    }
}

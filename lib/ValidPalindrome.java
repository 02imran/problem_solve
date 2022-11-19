public class ValidPalindrome {

    public static void main(String[] args) {
        boolean isValidPalindrome = false;
        String s = "A man, a plan, a canal: Panama";
        
        String str = s.replaceAll(
            "[^a-zA-Z0-9]", "");
            String str1 = str.toLowerCase();
            // System.out.println(str1);
            String result = "";

            for(int i = str1.length()-1; i>=0; i--){
                // result = str1.indexOf(i);
                result = result+str1.charAt(i);
            }
            
            if(str1.equals(result)){
                isValidPalindrome = true;
            }
    }
    
}

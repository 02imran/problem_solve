public class DecimalToBinary {

    public static void toBinary(Double num){   
        String convertedString=String.valueOf(num);
        String repleshString = convertedString.replace(".", "");
        int result = Integer.parseInt(repleshString);
        int binary[] = new int[40];    
        int index = 0;
        while(result > 0){
          binary[index++] = result%2;
          result = result/2;    
        }    
        for(int i = index-1;i >= 0;i--){    
          System.out.print(binary[i]);    
        }    
   }  
    public static void main(String[] args) {
        toBinary(1.11);   
    }
    
}

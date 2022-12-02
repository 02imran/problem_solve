public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String str = "";
        
        if(s.contains("PM")){
            if(s.contains("12")){
                String repleshTime = s.substring(0, s.length()-2);
                str = repleshTime;
                System.out.println(str);
            }else{
                String time = s.substring(0, 2);
                Integer timeConvert = Integer.parseInt(time);
                Integer sumOfTime = timeConvert+12;
                String timeString = sumOfTime.toString();
                String repleshTime = s.substring(0, 2).replace(time, timeString)+":"+s.substring(3, s.length()-2);
                str = repleshTime;
            }

        }else if(s.contains("AM")){
            if(s.contains("12")){
                String time = s.substring(0, 2);
                Integer timeConvert = Integer.parseInt(time);
                Integer sumOfTime = 00;
                String timeString = sumOfTime.toString();
                String repleshTime = "0"+s.substring(0, 2).replace(time, timeString)+":"+s.substring(3, s.length()-2);
                str = repleshTime;
                System.out.println(str);
            }else{
                String repleshTime = s.substring(0, s.length()-2);
                str = repleshTime;
                System.out.println(str);
            }
        }

        return str;
    
        }
    public static void main(String[] args) {
        timeConversion("12:45:54PM");
    }
    
}

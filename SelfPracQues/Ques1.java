import java.time.LocalDate;
import java.util.Scanner;
public class Ques1 {



    public static String reverse(String year) {

        String reversed = "";
        for (int i = year.length() - 1; i >= 0; i--) {
            reversed += year.charAt(i);
        }
        return reversed;

    }

    public static String lastPalindromicDate(String currentYear) {

        int year = Integer.parseInt(currentYear);
        for ( int i = year; i>=1000; i--) {

            String day;
            String month;
            String revYear = reverse(String.valueOf(i));
            day = revYear.substring(0,2);
            month = revYear.substring(2,4);

            int DD = Integer.parseInt(day);
            int MM = Integer.parseInt(month);

            //checking if the date formed is valid or not
            if (DD < 1 || DD > 31 || MM < 1 || MM > 12) {
                continue;
            } else {
                return day + "-" + month + "-" + i;
            }

        }

        return "No palindromic date found";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current year:");
        String currentYear = sc.nextLine();
        System.out.println(lastPalindromicDate(currentYear));

    }

    
        
        
    

}

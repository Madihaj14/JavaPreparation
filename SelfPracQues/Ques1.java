import java.time.LocalDate;
import java.util.Scanner;

/*Question 1: Write a java function that returns the last occurred palindromic date in ddmmyyyy.  
    That is, if we run it today, it should return  22022022. (22 feb 2022). 
    And if we run it in future, say in december 2031, it should return 13022031. (13 feb 2031)
    */

public class Ques1 {


    //Reverse method to reverse the year
    public static String reverse(String year) {

        String reversed = "";
        for (int i = year.length() - 1; i >= 0; i--) {
            reversed += year.charAt(i);
        }
        return reversed;

    }

    //method to find the last palindromic date
    public static String lastPalindromicDate(String currentYear) {

        //converting the current year to integer
        int year = Integer.parseInt(currentYear);
        for ( int i = year; i>=1000; i--) {

            String day;
            String month;
            String revYear = reverse(String.valueOf(i));
            day = revYear.substring(0,2);
            month = revYear.substring(2,4);

            //converting day and month to integer
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

    //main method with take year as input and pass it to lastPalindromicDate method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current year:");
        String currentYear = sc.nextLine();
        System.out.println(lastPalindromicDate(currentYear));

    }  
    

}

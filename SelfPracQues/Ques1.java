import java.time.LocalDate;
import java.util.Scanner;
public class Ques1 {

    
    public static void main(String[] args) {

        System.out.println(lastPalindromicDate());

    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String lastPalindromicDate () {
        // Implementation goes here


        //Taking input from user for the year

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current year in YYYY format: ");
        String currentYear = sc.nextLine();


        //going backwards year by year from the one given
        for (int i = Integer.parseInt(currentYear); i >= 1000; i--) {

            String day;
            String month;
            String year = currentYear;
            
            //Reversing the year to get day and month
            reverseString(year);
            day = reverseString(year).substring(0,2);
            month = reverseString(year).substring(2,4);

            //validate the date
            LocalDate.of(day, month, year);


            return day + month + year;

        }
        
    }

}

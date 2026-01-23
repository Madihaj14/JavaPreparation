public class Ques2 {
    
    //Write a java function to convert any integer to roman letters. input: 23 , output: XXII
    /*
    Intution: I am first gonna define each symbol for the integer values in two arrays. One for the integer values and one for the corresponding roman letters.
    Then I will iterate through the integer values array from the largest to the smallest value. For each value, I will determine how many times it fits into the input integer.
    I will append the corresponding roman letters to the result string that many times and subtract the total value from the input integer.
    I will continue this process until the input integer is reduced to zero.
    */

    public static String convertToRoman(int num ) {

        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] intValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < intValues.length; i++) {
            while (num >= intValues[i]) {
                result.append(romanNumerals[i]);
                num -= intValues[i];
            }
        }

        return result.toString();
    }
  



}

public class Ques2 {
    
    //Write a java function to convert any integer to roman letters. input: 23 , output: XXII


    public static String intToRoman(int num) {
        // Define the mapping of integers to Roman numerals
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder romanNumeral = new StringBuilder();
        
        // Convert integer to Roman numeral
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                romanNumeral.append(symbols[i]);
            }
        }
        
        return romanNumeral.toString();
    }



}

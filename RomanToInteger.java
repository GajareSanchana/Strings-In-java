public class RomanToInteger {
    public static int romanToInt(String s) {
        // Parallel arrays: each index represents a Roman numeral and its value
        char[] symbols = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[]  values  = {  1,   5,  10,  50, 100, 500, 1000};

        int total = 0;      // final converted number
        int prevValue = 0;  // stores the value of the previous Roman numeral

        // Loop from rightmost character to leftmost
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            // Find numeric value of the current Roman character
            int value = 0;
            for (int j = 0; j < symbols.length; j++) {
                if (symbols[j] == ch) {
                    value = values[j];
                    break; // stop once we find the match
                }
            }

            // If current numeral < previous numeral, subtract it; else add it
            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            // Update prevValue for next iteration
            prevValue = value;
        }

        return total;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(romanToInt("III"));    // Output: 3
        System.out.println(romanToInt("LVIII"));  // Output: 58
        System.out.println(romanToInt("MCMXCIV"));// Output: 1994
    }
}

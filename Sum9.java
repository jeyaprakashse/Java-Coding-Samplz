/*Please find the Coding challenge:
1.) Display all the numbers between 0 and 200 satisfying all the below conditions.
Conditions:
i) Sum of the digits should be 9
ii) Digits should be in ascending order i.e., the digit on the left should be lesser than the digit in the right
For Example: 27 -> 2+7=9 and 2 is less than 7
For Example: 135 -> 1+3+5=9 and 1 is less than 3 is less than 5*/

public class Sum9 {
    public static void main(String[] args) {
        // Loop through all numbers between 0 and 200
        for (int num = 0; num <= 200; num++) {
            // Convert the number to string to easily check each digit
            String numStr = String.valueOf(num);
            
            // Check if the sum of digits is 9 and the digits are in ascending order
            if (isSumOfDigitsNine(numStr) && areDigitsInAscendingOrder(numStr)) {
                // Print the number if both conditions are met
                System.out.println(num);
            }
        }
    }

    // Method to check if the sum of digits is 9
    public static boolean isSumOfDigitsNine(String numStr) {
        int sum = 0;
        // Loop through each character (digit) in the string
        for (char digit : numStr.toCharArray()) {
            // Convert the character to its numerical value and add to sum
            sum += Character.getNumericValue(digit);
        }
        // Return true if the sum equals 9
        return sum == 9;
    }

    // Method to check if the digits are in ascending order
    public static boolean areDigitsInAscendingOrder(String numStr) {
        // Loop through the digits
        for (int i = 0; i < numStr.length() - 1; i++) {
            // If any digit is greater than or equal to the next one, return false
            if (numStr.charAt(i) >= numStr.charAt(i + 1)) {
                return false;
            }
        }
        // Return true if all digits are in ascending order
        return true;
    }
}

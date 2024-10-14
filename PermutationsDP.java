import java.util.*;

public class PermutationsDP {
    
    // Memoization map to store previously computed permutations of substrings
    private static Map<String, List<String>> memo = new HashMap<>();
    
    public static void main(String[] args) {
        String input = "abc"; // Example input
        List<String> permutations = getPermutations(input);
        
        // Print all permutations
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    // Function to find all permutations of the given string using DP-like memoization
    public static List<String> getPermutations(String str) {
        // Base case: if the string is empty, return a list with an empty string
        if (str.length() == 0) {
            List<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        // If the result is already computed for this string, return it from the memo
        if (memo.containsKey(str)) {
            return memo.get(str);
        }

        // To store all permutations of the current string
        List<String> result = new ArrayList<>();
        
        // Loop through the string and fix one character at a time
        for (int i = 0; i < str.length(); i++) {
            // Choose the current character
            char currentChar = str.charAt(i);
            
            // Form the remaining string by excluding the current character
            String remainingString = str.substring(0, i) + str.substring(i + 1);
            
            // Get all permutations of the remaining string (recursive step)
            List<String> remainingPermutations = getPermutations(remainingString);
            
            // Add the current character to the beginning of each permutation of the remaining string
            for (String perm : remainingPermutations) {
                result.add(currentChar + perm);
            }
        }

        // Store the computed permutations in the memo map
        memo.put(str, result);
        System.out.println("Permutations so far: " + memo);
        // Return the result
        return result;
    }
}

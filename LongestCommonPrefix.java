public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(arr1)); // Output: fl

        String[] arr2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(arr2)); // Output: ""
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current string doesn't start with the prefix
            while (!strs[i].startsWith(prefix)) {
                // Reduce prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

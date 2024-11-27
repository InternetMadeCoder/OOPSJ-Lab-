public class Prob3 {
    public static void checkForVowels(String input) throws Exception {
        if (!input.toLowerCase().matches(".*[aeiou].*")) {
            throw new Exception("No vowels found in the string: " + input);
        }
    }

    public static void main(String[] args) {
        String testString = "hll";
        try {
            checkForVowels(testString);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

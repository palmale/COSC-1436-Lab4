import java.util.Scanner;
class StringLab{
    public static void main(String args[]){
        String message = "Welcome to the Java String Lab!";

        System.out.println("Length: " + message.length());

        System.out.println("Character at index 7: " + message.charAt(7));

        System.out.println("Extracted string: " + message.substring(15, 19));

        System.out.println("Uppercase string: " + message.toUpperCase());

        System.out.println("Lowercase string: " + message.toLowerCase());

        System.out.println("First occurance of Java: " + message.indexOf("Java"));

        System.out.println("Does the string Contain the word \"Lab\": " + message.contains("Lab"));

        System.out.println("Replace Java with Java Programming: " + message.replace("Java", "Java Programming"));

        String [] words = message.split(" ");
        System.out.println("Splitting the string:");
        for (String word : words){
            System.out.println(word);
        }
        System.out.println("Trimmed String: '" + message.trim() + "'");

        String compareStr = "java string lab!";

        System.out.println("Equals compareStr? " + message.equals(compareStr));

        System.out.println("EqualsIgnoreCase compareStr? " + message.equalsIgnoreCase(compareStr));

         //  Task 2 

        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < message.length(); i++) {
            if (vowels.indexOf(message.charAt(i)) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in message: " + vowelCount);

        
        String word = "racecar";
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(word + " is " + (isPalindrome ? "a palindrome." : "not a palindrome."));

        
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Enter a sentence containing the word \"Java\":");
            input = scanner.nextLine();
        } while (!input.contains("Java"));

        System.out.println("Thank you!");
        scanner.close();
        
    }
}
        









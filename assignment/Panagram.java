import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert the input to lowercase
        
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }
    
    public static boolean isPangram(String s) {
        // Create a set to store unique lowercase letters
        Set<Character> letters = new HashSet<>();
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                letters.add(c); // Add it to the set
            }
        }
        
        // If the set contains all 26 letters, it's a pangram
        return letters.size() == 26;
    }
}

import java.util.*;
public class vowelornot{
    public static void main(String args[]) {
    Scanner inp = new Scanner(System.in);
    System.out.print("\nEnter Character: ");
    char c = (inp.nextLine()).charAt(0);
    char z = Character.toUpperCase(c); // Changing value to uppercase for uniformity.

    if (z == 'A' || z == 'E' || z == 'I' || z == 'O' || z == 'U') {
        // Checking if vowel
        System.out.println(c + " is a vowel.");
    } else {
        System.out.println(c + " is not a vowel.");
    }
}
}
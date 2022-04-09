import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
       
        System.out.println("please enter your name:");

        Scanner scan = new Scanner(System.in); 

        String name = scan.nextLine();

        String newString = reverseString(name);

        System.out.println("\n\n" + newString);
    }

    public static String reverseString(String anyString) {
        String reversedString = "";

        // get length 
        int anyStringLen = anyString.length();

        // use a for loop to reverse a string 
        for ( int i = anyStringLen - 1; i >= 0; i--) {
            reversedString += anyString.charAt(i);
        }

        // return reversed string
        return reversedString;

    }
}
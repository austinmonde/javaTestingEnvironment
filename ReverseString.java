public class ReverseString {
    public static void main(String[] args) {
        String newString = reverseString("Patrick");

        System.out.println("\n\n" + newString);
    }

    public static String reverseString(String anyString) {
        String reversedString = "";

        // get lenght 
        int anyStringLen = anyString.length();

        // use a for loop to reverse a string 
        for ( int i = anyStringLen - 1; i >= 0; i--) {
            reversedString += anyString.charAt(i);
        }

        // return reversed string
        return reversedString;

    }
}
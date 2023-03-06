
import java.util.*;

public class lab5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean bool = true; // initilize Boolean variable for break the do while loop
        // start do....while loop for menu driven pro.
        do {
            System.out.println("Press 1. For encryption\nPress 2. For decryption\nPress 3. For Exit"); // display choices
            System.out.print("Enter Your Choice: "); // user choice
            int chr = Integer.parseInt(sc.nextLine());
            String enc;
            String dec;
            switch (chr) {
                case 1: // for encyption
                    System.out.print("Enter The text for Encryption: ");
                    enc = sc.nextLine();
                    dec = encryption(enc.toUpperCase()); // convert to encryption method call
                    System.out.println("\nYour Encrypted massage is: " + dec); // display encrypted massage
                    break;
                case 2: // for decryption
                    System.out.print("Enter The text for decryption: ");
                    dec = sc.nextLine();
                    enc = decryption(dec.toUpperCase());// convert to decryption method call
                    System.out.println("\nYour descrypted massage is: " + enc);// display decrypted massage
                    break;
                case 3: // for Exit
                    bool = false;
                    break;

                default:
                    break;
            }

        } while (bool); // loop break condition

    }

    static String encryption(String str) {
        String news = ""; // define a variable
        char c = ' ';
        // start for loop to encrypt particuler character
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i); // assign a character by the index
            int x = a;

            if (x >= 65 && x <= 90) { // validate range of character ascii value
                int y = x + 23;
                if (y > 90) {
                    y = y - 26;
                }
                c = (char) y;
            } else {
                c = str.charAt(i);
            }
            news = news + c;// concadinate string
        }

        return news; // return encrypted massage
    }

    static String decryption(String str) {
        String newst = "";
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);// assigning a character by the index
            int x = a;

            if (x >= 65 && x <= 90) { // validate range of character ascii value
                int y = x - 23;
                if (y < 65) {
                    y = y + 26;
                }
                c = (char) y;
            } else {
                c = str.charAt(i);
            }
            newst = newst + c; // concadinate string
        }

        return newst;// return decrypted massage
    }

}


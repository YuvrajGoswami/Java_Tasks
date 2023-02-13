
import java.util.*;

/**
 * lab3
 */
public class lab3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;// initialize conditional variable it is used to exit do while loop
        String[][] str = new String[5][5]; // initialize two D array

        // start do while loop for infinite time choice till user do not want to exit
        do {
            // Create menu driven options
            System.out.println("\n ********* WELCOME IN TO THE PROGRAMME *********");
            System.out.println(
                    "********** MAKE YOUR CHOICE            ********* \n      Press 1 to collect the details.       \n      Press 2 to display the details.        \n      Press 3 to search a student.         \n      Press 4 for exit.1      ");
            System.out.print("*********Enter your choice: **********");
             
            int num = Integer.parseInt(sc.nextLine()); // user choice
            switch (num) {
                case 1:
                    str = Collectdetails(); // calling Collectdetails mathod with no argument
                    break;
                case 2:
                    Displaydetails(str);// calling Displaydetails mathod with argument
                    break;
                case 3:
                    Searchdetails(str); // condition
                    break;
                case 4:
                    a = a + 1; // condition
                    break;

                default:
                    System.out.print("invalid Choice.........");
                    break;
            }
        } while (a == 0); // end while loop

    }

    // start Collectdetails mathod to collect data of student
    static String[][] Collectdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students you want to enter: ");
        int x = Integer.parseInt(sc.nextLine());

        String[][] arrstud = new String[x][6];
        for (int i = 0; i < x; i++) {
            System.out.println("\n....... Enter Details of student " + (i + 1) + " ...");
            System.out.print("Enter Name: ");
            arrstud[i][0] = sc.nextLine();
            System.out.print("Enter Register No.: ");
            arrstud[i][1] = sc.nextLine();
            System.out.print("Enter Email: ");
            arrstud[i][2] = sc.nextLine();
            System.out.print("Enter Class: ");
            arrstud[i][3] = sc.nextLine();
            System.out.print("Enter Department: ");
            arrstud[i][4] = sc.nextLine();

        }
        return arrstud;

    }

    // start Displaydetails mathod to display data of student
    static void Displaydetails(String[][] arrstud) {
        // Scanner sc=new Scanner(System.in);
        System.out.println("\n\n ...The Students details is given below...");
        for (int i = 0; i < arrstud.length; i++) {
            System.out.println("\n*************** Student " + (i + 1) + " Details ***************");
            System.out.println("\t Name: " + arrstud[i][0]);
            System.out.println("\t Register No.: " + arrstud[i][1]);
            System.out.println("\t Email: " + arrstud[i][2]);
            System.out.println("\t Class: " + arrstud[i][3]);
            System.out.println("\t Department: " + arrstud[i][4]);
        }

    }

    static void Searchdetails(String[][] arrstud) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Search Name: ");
        String num = sc.nextLine();
        int a = 0;
        for (int i = 0; i < arrstud.length; i++) {
            if (arrstud[i][0].equalsIgnoreCase(num)) {
                System.out.println("\n*************** Student " + num + " Details ***************");
                System.out.println("\t Name: " + arrstud[i][0]);
                System.out.println("\t Register No.: " + arrstud[i][1]);
                System.out.println("\t Email: " + arrstud[i][2]);
                System.out.println("\t Class: " + arrstud[i][3]);
                System.out.println("\t Department: " + arrstud[i][4]);
                a = 1;
            }
        }
        if (a == 0) {
            System.out.println(num + " Student ont found.....");
        }

    }

}
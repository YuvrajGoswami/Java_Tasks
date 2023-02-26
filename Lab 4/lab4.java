import java.util.*;

public class lab4 {
    static Scanner sc = new Scanner(System.in);
    static int Acc_Num = 22122060;
    static String Acc_Holder_Name = "Yuvraj Giri";
    static int Acc_Bal = 35000;

    public static void main(String[] args) {
        int x = 0, y = 0;
        String a;
        String[][] transactions = new String[1024][3];
        String[] ay = new String[3];
         
                    // ay = initialize_the_cust.();
                    // Acc_Num = Integer.parseInt(ay[0]);
                    // Acc_Holder_Name = ay[1];
                    // Acc_Bal = Integer.parseInt(ac[2]);
        System.out.println("\n--------------- Acc Details ---------------");
        System.out.print("A/c Number: "+Acc_Num);
       
        System.out.print("A/c Holder Name: "+Acc_Holder_Name);
        
        System.out.print("A/c Balance: "+Acc_Bal);
       


              
        do {

            System.out.println("\n--------------- Your choices ---------------");
            System.out.println(
                    "\n1. To deposit money \n2. To withdraw money \n3. To print the transactions \n4. To print account summary \n5. Exit");
            System.out.print("Enter your choice: ");
            int Number = Integer.parseInt(sc.nextLine());

            switch (Number) {
               
                case 1:
                    transactions[y] = depositmoney();
                    System.out.println("Account balance deposit succesfully\nBalance: " + Acc_Bal);
                    y = y + 1;
                    break;
                case 2:
                    transactions[y] = withdrawmoney();
                    System.out.println("Account balance withdraw succesfully\nBalance: " + Acc_Bal);
                    y = y + 1;
                    break;
                case 3:
                    a = printthetransactions(transactions,y);
                    a="";
                    break;
                case 4:
                    a=summary();
                    break;
                case 5:
                    x = 1;
                    break;

                default:
                    break;
            }

        } while (x != 1);

    }

    // static String[] initialize_the_customer() {
    // String[] arr = new String[3];
    // System.out.println("\n--------------- Account Details ---------------");
    // System.out.print("Enter A/c Number: ");
    // arr[0] = scan.nextLine();
    // System.out.print("Enter A/c Holder Name: ");
    // arr[1] = scan.nextLine();
    // System.out.print("Enter A/c Balance: ");
    // arr[2] = scan.nextLine();

    // return arr;
    // }

    static String[] depositmoney() {
        String[] str = new String[3];
        str[0] = "Deposit";
        System.out.println("\n---------------- Deposit Money ----------------");
        System.out.println("Your Current Balance: " + Acc_Bal);
        System.out.print("How much money want to deposit: ");
        String bl = sc.nextLine();
        str[1] = bl;
        Acc_Bal = Acc_Bal + Integer.parseInt(bl);
        str[2] = Integer.toString(Acc_Bal);
        return str;
    }

    static String[] withdrawmoney() {
        String[] str = new String[3];
        str[0] = "Withdraw";
        System.out.println("\n---------------- Withdraw Money ----------------");
        System.out.println("Your Current Balance: " + Acc_Bal);
        System.out.print("How much money want to withdraw: ");
        String bl = sc.nextLine();
        str[1] = bl;
        Acc_Bal = Acc_Bal - Integer.parseInt(bl);
        str[2] = Integer.toString(Acc_Bal);
        return str;
    }

    static String printthetransactions(String[][] arr, int c) {
        System.out.println("\n---------------- Transaction ----------------");
        System.out.print("Transaction ");
        System.out.print("\ttype: ");
        System.out.print("\t\tBalance: ");
        System.out.print("\tAvailable Balance: ");

        for (int i = 0; i < c; i++) {
            System.out.print("\n\t" + (i + 1) + "\t" + arr[i][0]);
            if (arr[i][0].equalsIgnoreCase("Deposit")) {
                System.out.print("\t\t" + arr[i][1] + " \tcr\t" + arr[i][2]);

            } else {
                System.out.print("\t" + arr[i][1] + "\tdr\t" + arr[i][2]);
            }

        }

        return "true";
    }

    static String summary() {
        System.out.println("\n---------------- Account Summary ----------------");
        System.out.println("\n Account No.: " + Acc_Num + "\n Account Holder Name : " + Acc_Holder_Name
                + "\n Available Account Balance : " + Acc_Bal);
        return "true";
    }

}

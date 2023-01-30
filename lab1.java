//LAB1

/*Write a Java Program that will collect an employee's basic details that fall into different data types and displays them.
After the details have been displayed, with the help of conditional statements, check if the gender of the employee is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'.
Assume that you can divide the states among India into different regions (North, South, Central, East, and West). If the employee is from the southern part of India, with the help of a switch statement, it should display "The Employee is from the southern states of India; Preferable work location is in <state>", along with the basic details.
Identify if the employee belongs to the top MNC Companies (Facebook, Google, Microsoft, Samsung, IBM, Apple); if so, print a message "The employee is working in Top MNC Companies".

Note: Your program should be neatly organized, with appropriate comments, variable names, proper input output formatting, and necessary validations.*/

import java.util.*;

public class lab1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Employee name");
        String name = sc.nextLine();
        
        System.out.println("Employee's age");
        int age =  Integer.parseInt(sc.nextLine());
        
        System.out.println("Employee's salary");
        int sal =  Integer.parseInt(sc.nextLine());
        
        System.out.println("Employee's gender:'m' or 'f' ");
        String gen = sc.nextLine();
        
        System.out.println("Employee's state");
        String state = sc.nextLine();
        
        System.out.println("Employee works in which company");
        String company = sc.next();
        
        System.out.println("Employee details");
        System.out.println("Employee name"+name);
        System.out.println("Employee age"+age);
        System.out.println("Employees salary"+sal);
        System.out.println("Employee gender"+gen);
        System.out.println("Employee's state"+state);
        System.out.println("Employee's company"+company);
        
        if (gen.compareToIgnoreCase("M") == 0) {
            System.out.println("Employee gender is: MALE");
        } else if (gen.compareToIgnoreCase("f") == 0) {
            System.out.println("Employee gender is: FEMALE");
        } else {
            System.out.println("Employee gender is not valid");
        }
        
        switch (state) {
            case "Arunachal Pradesh", "Assam", "Meghalaya", "Manipur", "Mizoram", "Nagaland", "Tripura", "Sikkim":
                System.out.println(
                        "The Employee is from the Northeastern states of India; Preferable work location is in " + state
                                + ".");
                break;
            case "Rajasthan", "Uttar Pradesh", "Ladakh", "Himachal Pradesh", "Uttarakhand", "Punjab", "Haryana",
                    "Jammu and Kashmir", "Delhi", "Chandigarh":
                System.out.println("The Employee is from the Northern states of India; Preferable work location is in "
                        + state + ".");

                break;
            case "Karnataka", "Tamil Nadu", "Andhra Pradesh", "Telangana", "Kerala", "Puducherry":
                System.out.println("The Employee is from the southern states of India; Preferable work location is in "
                        + state + ".");
                break;
            case "Maharashtra", "Gujarat", "Goa", "Dadra and Nagar Haveli and Daman and Diu":
                System.out.println("Th  e Employee is from the Western states of India; Preferable work location is in "
                        + state + ".");
                break;
            case "Jharkhand", "West Bengal", "Bihar", "Odisha":
                System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "
                        + state + ".");
                break;
            case "Chhattisgarh", "Madhya Pradesh":
                System.out.println("The Employee is from the Central states of India; Preferable work location is in "
                        + state + ".");
                break;
            default:
                break;
        }
        if (company.compareToIgnoreCase("Facebook") == 0 || company.compareToIgnoreCase("Google") == 0
                || company.compareToIgnoreCase("Microsoft") == 0 || company.compareToIgnoreCase("Samsung") == 0
                || company.compareToIgnoreCase("IBM") == 0 || company.compareToIgnoreCase("Apple") == 0) {
            System.out.println("The employee is working in Top MNC Companies.");
        }
        
        
        
    }
}
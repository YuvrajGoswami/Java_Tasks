// Java Program to illustrate
// reading from Text File
// using Scanner Class
import java.io.File;
import java.util.Scanner;
public class lab7
{
  public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter
    File file = new File("C:\\Users\\Yuvraj\\Downloads\\Iris data.txt");
    Scanner sc = new Scanner(file);
    //String str
    //String[]arrn = new String[200];
    //String []
    while (sc.hasNextLine()){
      //System.out.println(sc.nextLine());
      String str = sc.nextLine();
      String[]arr1 = str.split(","); 
      for(String i : arr1){
        System.out.print(i);
      }
       
      

    }
  }
}
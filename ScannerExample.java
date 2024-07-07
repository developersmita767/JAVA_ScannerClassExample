import java.util.*;
public class ScannerExample{
    public static void main(String[] ar){
        //creating scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter name:");
        String userInput=sc.nextLine();
         System.out.println("Please enter Age:");
        int userAge=sc.nextInt();
        System.out.println("User name is:"+userInput);
         System.out.println("User Age is:"+userAge);
    }
}
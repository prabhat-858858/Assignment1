package prabhat;
import java.util.*;
public class check_power_of_2 {
    public static void main(String[]args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number");
              int n=sc.nextInt();
            if((n&(n-1))==0){
              System.out.println("Power of 2");
            }else{
                System.out.println("No");
            }
        }

    } 
}

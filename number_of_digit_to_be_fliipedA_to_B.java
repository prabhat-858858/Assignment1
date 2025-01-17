package prabhat;
import java.util.*;
public class number_of_digit_to_be_fliipedA_to_B {
    public static void main(String[]args){
      try(Scanner sc=new Scanner(System.in)){
       System.out.println("Enter the first number");
       int A=sc.nextInt();
       int B=sc.nextInt();
       int count=0;
       while((A!=0)||(B!=0)){
        if((A&1)!=(B&1)){
            count++;
        }
        A=A>>1;
        B=B>>1;
       }
       System.out.println(count+" number of bit to be fliped");
      }
    }
}

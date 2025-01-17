package prabhat;
import java.util.*;
public class position_of_setbit {
    public static void main(String[]args){
    try(Scanner sc=new Scanner(System.in)){
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int i=1;
      while(n!=0){
        if((n&1)==1){
            System.out.println(i);
        }
        i++;
        n=n>>1;
      }
    }
}
}

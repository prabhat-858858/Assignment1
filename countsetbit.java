package prabhat;
import java.util.*;
public class countsetbit {
    public static void main(String[]args){
        System.out.print("good morning");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            if((n&1)==1){
             count++;
            }
            n=n>>1;
        }
       System.out.println(count); 
    }
}

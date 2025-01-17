package prabhat;
import java.util.*;
public class square_BITMANUPULATION {
    public static void main(String[]args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number");
            int n=sc.nextInt();
            int temp=n;
            
            int res=0;
            int idx=0;
            while(temp>0){
                int t=n;
                if((temp&1)!=0){
                    res=res+(t<<idx);
                }
                idx++;
                temp=temp>>1;
            }
            System.out.println(res);
        }
    }
}

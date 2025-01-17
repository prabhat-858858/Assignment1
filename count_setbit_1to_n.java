package prabhat;
import java.util.*;
public class count_setbit_1to_n {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            int n=i;
            int count=0;
            while(n!=0){
                if((n&1)==1){
                    count++;
                }
                n=n>>1;
            }
           System.out.println("for"+i+"="+count); 
        }
    }
}

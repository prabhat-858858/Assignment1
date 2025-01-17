package prabhat;
import java.util.*;
public class divide_two_numbers_without_mul_div_mod_operator {
   public static void main(String[]args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the dividend");
        int dividend=sc.nextInt();
       System.out.println("Enter the divisor");
       int divisor=sc.nextInt();
       if(divisor==1){
        System.out.println(dividend);
       }
       if(dividend==Integer.MIN_VALUE){
        dividend++;
       }
       int sign=-1;
       int res=0;
       if(((dividend<0)&&(divisor<0))||((dividend>=0)&&(divisor>=0))){
        sign=1;
       }
       dividend=Math.abs(dividend);
       divisor=Math.abs(divisor);
       while(divisor<=dividend){
            dividend=dividend-divisor;
             res++;
       }

       res=res*sign;
       System.out.println(res);
    }
   } 
}

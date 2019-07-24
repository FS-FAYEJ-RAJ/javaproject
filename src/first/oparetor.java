
package first;

import java.util.Scanner;


public class oparetor {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         
         
//        //Arithomatice Oparetoe
//        
//        int a,b,c;
//        System.out.println("Plesse Enter a value:");
//        a=input.nextInt();
//        System.out.println("Please Enter b value:");
//        b=input.nextInt();
//        
//        c=a+b;
//        
//        System.out.println("Ans="+c);
//        
        System.out.println("please Enter any Year:");
        int year=input.nextInt();
        
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("Leap year:"+year);
        }
        else
            System.out.println("Not year:"+year);
        
        
            
        
        
        
        
        
       
        
    }
    
}

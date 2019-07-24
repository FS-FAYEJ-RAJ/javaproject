
package Arry;

import java.util.Scanner;


public class firstaryy { 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int[] array=new int[5];
        for (int i = 0; i < array.length; i++)
        {
            
            System.out.println("please Enter any value:"+i);
            
          array[1]=input.nextInt();
           sum= sum+array.length;
          
          
            
        }
        System.out.println("Ans:"+sum);
    }
    
}

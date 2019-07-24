
package forloop;

public class fiboonaki {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=11;
        System.out.print(" "+a+" "+b);
        for (int i = 1; i < 10; i++) {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            
        }
    }
            
    
}

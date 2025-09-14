// package basics;
import java.util.Scanner;
public class Swap {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        
        System.out.print("b = ");
        int b = sc.nextInt();
        int c=0;
        c = a;
        a=b;
        b=c;
        System.out.println("Swap Using Third variable:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap Without Using Third variable:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Swap Without Using Third variable");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        sc.close();
    }
}
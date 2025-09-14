import java.util.Scanner;
public class Factorial {
    static long calc_fact(int n){
        long val=1;
        if(n==0 || n ==1) return 1;
        for (int i=1;i<=n;i++){
            val *=i;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println(calc_fact(n));
        sc.close();
    }
}

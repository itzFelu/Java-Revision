import java.util.Scanner;
public class Prime {
    public static Boolean is_prime(int n){
        for(int i = 2; i<Math.sqrt(n); i++){
            if (n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println(is_prime(n));
        sc.close();
    }
}

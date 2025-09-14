import java.util.Scanner;

public class FizzFuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for ( int i = 1; i <= n; i++){
            if (i%3==0) {
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Fuzz");
            } else {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

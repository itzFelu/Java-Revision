import java.util.Scanner;
public class Sum_of_Even_Numbers_in_a_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lower Range: ");
        int low = sc.nextInt();
        
        System.out.print("Enter Upper Range: ");
        int up = sc.nextInt();

        long sum = 0;
        for(int i=low; i<=up; i++){
            if (i%2 == 0) sum+=i;
        }
        System.err.println("sum of all even integers in the range: "+low+" to "+up+": "+sum);
        sc.close();
    }
}

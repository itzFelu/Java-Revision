import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next().toLowerCase();
        char []str_arr = str.toCharArray();
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if (str_arr[i]!=str_arr[n-i-1]) {
                System.out.println(str+": Not a Palindrome");
                return;
            }
        }
        System.out.println(str+": Palindrome");
        sc.close();
    }
}

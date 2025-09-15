import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        char []arr1 = sc.next().toLowerCase().toCharArray();
        System.out.print("Enter String2: ");
        char []arr2 = sc.next().toLowerCase().toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String str1 = Arrays.toString(arr1);
        String str2 = Arrays.toString(arr2);
        if (str1.equals(str2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}

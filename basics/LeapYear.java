import java.util.Scanner;

public class LeapYear {
    public static Boolean isLeapYear(int year){
        if (year%100 == 0){
            return year%400 == 0;
        }else{
            return year%4 == 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
        sc.close();
    }
}

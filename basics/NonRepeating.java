import java.util.Scanner;
import java.util.HashMap;
public class NonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        char  []str_arr = sc.next().toLowerCase().toCharArray();
        HashMap <Character, Boolean> hmap = new HashMap<>();
        char ch='\0';
        for(int i=0; i<str_arr.length; i++){
            if (hmap.containsKey(str_arr[i])){
                ch = str_arr[i];
                break;
            }else{
                hmap.put(str_arr[i], true);
            }
        }
        if(ch != '\0') System.out.println("First Repeating character: "+ch);
        else System.out.println("No Repeating character");

        sc.close();
    }
}

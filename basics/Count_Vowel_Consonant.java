import java.util.HashMap;
import java.util.Scanner;

public class Count_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next().toLowerCase();
        HashMap <String, Integer> count_map = new HashMap<>();
        count_map.put("vowels", 0);
        count_map.put("consonants", 0);
        String vowels = "aeiou";
        for(int i = 0 ; i<str.length() ; i++){
            String seq = String.valueOf(str.charAt(i));
            // System.out.println(seq);
            if (vowels.contains(seq)){
                count_map.put("vowels", count_map.get("vowels")+1);
            }
            else {
                count_map.put("consonants", count_map.get("consonants")+1);
            }
        }
        System.out.println(count_map);
        sc.close();
    }
}

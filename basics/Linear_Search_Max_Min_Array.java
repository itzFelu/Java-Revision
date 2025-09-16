import java.util.Scanner;

public class Linear_Search_Max_Min_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in the Array:");
        for (int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter search key: ");
        int search_key=sc.nextInt();
        boolean is_found = false;
        int idx = -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(!is_found && arr[i]==search_key){
                is_found = true;
                idx = i;
            }
            if(min>arr[i]) min = arr[i];
            if(max<arr[i]) max = arr[i];
        }

        System.out.println("Search Key: '"+search_key+"' - "+(is_found?String.format("Found at index: %d", idx):"Not Found"));
        System.out.println(String.format("Max Element: %d, Min Element: %d", max,min));
        sc.close();
    }
}

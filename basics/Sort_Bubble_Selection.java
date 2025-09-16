import java.util.Scanner;

public class Sort_Bubble_Selection {
    public static void bubble_sort(int []arr, String sort_order){
        if (sort_order.toLowerCase() == "ascending"){
            for (int i=0;i<arr.length-1;i++){
                boolean swapped = false;
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j] > arr[j+1]){
                        //swap
                        arr[j]=arr[j]+arr[j+1];
                        arr[j+1]=arr[j]-arr[j+1];
                        arr[j]=arr[j]-arr[j+1];

                        swapped = true;
                    }
                }
                if (!swapped) break;
            }
        }else{
            for (int i=0;i<arr.length-1;i++){
                boolean swapped = false;
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j] < arr[j+1]){
                        //swap
                        arr[j]=arr[j]+arr[j+1];
                        arr[j+1]=arr[j]-arr[j+1];
                        arr[j]=arr[j]-arr[j+1];

                        swapped = true;
                    }
                }
                if (!swapped) break;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter elements in the Array:");
        for (int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Bubble Sort: Ascending Order");
        bubble_sort(arr, "ascending");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.println("Bubble Sort: Descending Order");
        bubble_sort(arr, "descending");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        sc.close();
    }
}

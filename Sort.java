import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner loc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = loc.nextInt();

        int[] arr = new int[n];
        System.out.println("-----------");
            for(int i = 0 ; i < n ; i++ ){
                arr[i] = loc.nextInt();
            }

            sortArray(arr);
            System.out.println("\n ---Output--- ");

            for(int sortNum : arr){
                System.out.println(sortNum);
            }
    }


// method
public static void sortArray(int[] arr){
    int temp ;
    for(int i = 0 ; i < arr.length ; i++){
        for(int j = i + 1 ; j < arr.length ; j++){
            if(arr[j] <= arr[i]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    }
}


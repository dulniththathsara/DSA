import java.util.Arrays;

public class BubbleSortDecending {
    public static void Swap(int []arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }   
    public static void bubbleSort(int []arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] < arr[j + 1]){
                    Swap(arr,j,j+1);
                }
                System.out.println("i = " + (i + 1) + "; j = " + (j + 1) + "; " + Arrays.toString(arr));
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numbers = {6,8,2,4,10,1,9,3,7,5};
        
        System.out.print("Before Sorting.....");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
        
        bubbleSort(numbers);
        
        System.out.println("After sorting.....");
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
    
}
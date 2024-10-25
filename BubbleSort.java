public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};

        System.out.println("Array before sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(numbers);

        System.out.println("Array after sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
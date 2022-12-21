public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array in ascending order: ");
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + "\n");
        }
    }

    public static void main(String[] args) {
        int numbers[] = {5, 34, 8, 10, 23};

        BubbleSort obj = new BubbleSort();
        obj.sort(numbers);
    }
}

public class SelectionSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array in ascending order: ");
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + "\n");
        }
    }

    public static void main(String[] args) {
        int numbers[] = {5, 34, 8, 10, 23};

        SelectionSort obj = new SelectionSort();
        obj.sort(numbers);
    }
}

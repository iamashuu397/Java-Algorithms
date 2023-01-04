public class BubbleSortTypes {
    public void ascendingBubbleSort(int[] arr) {
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

        System.out.println("Array in Ascending order: ");
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + "\n");
        }
    }

    public void descendingBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array in Descending order: ");
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + "\n");
        }
    }

    public static void main(String[] args) {
        BubbleSortTypes obj = new BubbleSortTypes();

        int arr[] = {12, 43, 34, 22, 2, 43, 23, 12, 32, 10};

        obj.ascendingBubbleSort(arr);
        obj.descendingBubbleSort(arr);
    }

}

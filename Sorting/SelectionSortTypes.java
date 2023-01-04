public class SelectionSortTypes {
    public void ascendingSelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Array in Ascending order: ");
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + "\n");
        }
    }

    public void descendingSelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Array in Descending order: ");
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + "\n");
        }
    }


    public static void main(String[] args) {
        SelectionSortTypes obj = new SelectionSortTypes();

        int arr[] = {12, 43, 34, 22, 2, 43, 23, 12, 32, 10};

        obj.ascendingSelectionSort(arr);
        obj.descendingSelectionSort(arr);
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int searchNumber = 50;
        int numbers[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int flag = 0;
        int M, L, U;
        M = 0;
        L = 0;
        U = 9;

        while(L <= U){
            M = (L + U) / 2;

            if(searchNumber > numbers[M]){
                L = M + 1;
            } else if(searchNumber < numbers[M]){
                U = M - 1;
            } else {
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Element found at: " + (M + 1));
        } else {
            System.out.println("Element not found");
        }
    }
}

import java.util.Scanner;

public class LinearSearch2{
    public static void main(String[] args) {
        int searchNumber;
        int numbers[] = {12, 13, 14, 15, 16, 17, 18, 19, 20};
        int flag = 0, i;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the number you want to search: ");
        searchNumber = inp.nextInt();

        for(i = 0; i < 7; i++){
            if(numbers[i] == searchNumber){
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Element found at: " + (i + 1));
        } else{
            System.out.println("Element not found");
        }
    }
}
public class LinearSearch{
    public static void main(String[] args) {
        int searchNumber = 13;
        int numbers[] = {12, 13, 14, 17, 19};
        int flag = 0, i;

        for(i = 0; i < 4; i++){
            if (numbers[i] == searchNumber){
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
import java.util.Arrays;

public class Main {
    public static int[] addArray(int length, int array[], int newOne){
        int i;

        int newArray[] = new int[length + 1];

        for (i = 0; i < length; i++){
            newArray[i] = array[i];
        }
        newArray[length] = newOne;
        return newArray;
    }
    public static String removal(int length, int array[]){
        int i;
        int newArray[] = new int[length-1];

        for (i=0; i<length-1; i++){
            newArray[i] = array[i];
        }
        return "New Array: " + Arrays.toString(newArray) + ". The popped value is: " + array[length-1];
    }
    public static int[] insertNew(int n, int arr[], int x, int pos) {
        int i;

        int[] newArray = new int[n + 1];

        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newArray[i] = arr[i];
            else if (i == pos - 1)
                newArray[i] = x;
            else
                newArray[i] = arr[i - 1];
        }
        return newArray;
    }
}

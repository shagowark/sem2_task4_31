import java.util.Arrays;

public class Main {
    public static void  main(String[] args){
        String[] arr = { "green", "blue", "red" };
        int[] ord = { 5, 8, 1 };

        sort(arr, ord);
        System.out.println(Arrays.toString(arr) + "\n" + Arrays.toString(ord));
    }

    public static <T> void sort(T[] data, int[] orderValues){
        int size = orderValues.length;
        for (int i = 0; i < size; i++){
            int orderValue = orderValues[i];
            T dataValue = data[i];
            int j;
            for (j = i - 1; j >= 0 && orderValues[j] > orderValue; j--){
                orderValues[j+1] = orderValues[j];
                data[j+1] = data[j];
            }
            orderValues[j+1] = orderValue;
            data[j+1] = dataValue;
        }
    }
}
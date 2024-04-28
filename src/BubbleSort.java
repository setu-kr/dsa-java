import java.util.Scanner;

public class BubbleSort {

    public BubbleSort(int[] arr) {
        int x;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;

                }

            }

        }

    }

    public static void main(String[] args) {

        int[] arr = { 0, 0, 1, 2, 3, 1, 1, 3, 2 };

      new BubbleSort(arr);



        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}

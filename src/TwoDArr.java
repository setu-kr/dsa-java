import java.util.Arrays;

public class TwoDArr {
    public static void main(String[] args) {


        int [][]arr={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(arr[1]));
        change(arr);
        System.out.println(Arrays.toString(arr[2]));

    }
    static void change(int [][]arr){
        arr[2][1]=9;
    }

}

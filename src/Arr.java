import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int []arr = {1,4,6,7,8};
        System.out.println(Arrays.toString(arr));

        change(arr);//modification in original value means change possible because both the arrays pointing the same object
        System.out.println(Arrays.toString(arr));

    }
    static void change(int arr[]){
        arr[0]=99;
    }
}

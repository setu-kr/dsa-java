import java.util.Arrays;
class changeValue {

    public static void main(String[] args) {
        int []arr= {1,3,4,5,6};
        Change(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void Change(int[] nums) {
        nums[2]=59;
    }


}

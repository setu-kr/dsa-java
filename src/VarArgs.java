import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,0};
//        func(arr);
        mul(2,4,"Setu", "Kumar", "is", "a bad guy");



    }

    static void mul(int a, int b, String ...var){
        System.out.print(a+ " " +b);

        System.out.print(Arrays.toString(var));
    }
    static void func(int ...var){
        System.out.println(Arrays.toString(var));
    }
}

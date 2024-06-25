import java.util.ArrayList;
import java.util.Scanner;




public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> variable= new ArrayList<>(5);

        Scanner in = new Scanner(System.in);

        variable.add(16);
        variable.add(20);
        variable.add(1);
        variable.add(45);
        variable.add(1642);
        variable.add(201);
        variable.add(136);
        variable.add(2530);
        variable.add(1236);
        variable.add(202);
        variable.add(1776);
        variable.add(200);
        variable.add(316);
        variable.add(240);

        System.out.println(variable);

        variable.remove(1);
        System.out.println(variable);
        variable.add(0,34);
        System.out.println(variable);
        System.out.println(variable.contains(202));
        variable.set(0,88);
        System.out.println(variable);

        for (int i = 0; i < 5; i++) {
          variable.add(in.nextInt());  //input of arraylist
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(variable.get(i));
        }

        System.out.println(variable);
        variable.add(5,6);
        System.out.println(variable);
    }
}










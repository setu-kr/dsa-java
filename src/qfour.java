import java.util.Scanner;

public class qfour {
    public static void main(String[] args) {
        qfour abc = new qfour();
        employee s1 = new employee();
        s1.id = 3176;
        s1.salary= 130000;
        abc.print(s1);

    }
    void print(employee s1){

        System.out.println(s1.id+" "+ s1.salary);
    }

    }

 class employee {
     int id;
     int salary;
 }
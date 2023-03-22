package TASK3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws TooBigSquareException {
        Square s1 = new Square(3);
        Square s2 = new Square(2);
        Square s3 = new Square(4);
        Square s4 = new Square(6);
        Square s5 = new Square(5);

        Square[] arr = {s1,s2,s3,s4,s5};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}

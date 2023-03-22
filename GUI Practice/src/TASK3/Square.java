package TASK3;
import java.util.Arrays;

public class Square implements Comparable<Square>, Figure{

        private int length, number;
        private static int counter=1;

    public Square(int length) throws TooBigSquareException {
        this.length = length;
        number= counter++;

        if (length > max)
            throw new TooBigSquareException(max);
    }

    public int getArea(){
        return length*length;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    public String toString(){
        return "("+ number + "):"+ getArea();
    }

    @Override
    public int compareTo(Square o) {
        if(o.getArea() > getArea()) return -1;
        else if (o.getArea() == getArea()) return 0;
        else return 1;
    }
}

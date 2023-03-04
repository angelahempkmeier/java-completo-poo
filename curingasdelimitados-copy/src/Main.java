import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28, 4.12, 3.90);
        List<Objects> myObjs = new ArrayList<Objects>();

        copy(myInts, myObjs);
        copy(myDoubles, myObjs);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for(Number number : source){
            destiny.add(number);
        }
    }
}
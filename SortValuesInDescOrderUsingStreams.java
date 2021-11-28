package EdyodaPractice.Streams;
import java.util.*;
import java.util.stream.*;

public class SortValuesInDescOrderUsingStreams
{
    public static void main(String[] args)
    {
        List<Integer> myList = Arrays.asList(10,50,30,60,20,70,40,80,90);

        myList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

    }
}

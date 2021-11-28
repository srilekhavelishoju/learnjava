package EdyodaPractice.Streams;

import java.util.stream.*;
import java.util.function.Function;
import java.util.*;
import java.util.Arrays;

public class SortValuesUsingStreams
{
    public static void main(String[] args)
    {
        List<Integer>list=Arrays.asList(20,40,10,80,70,50,60);
        list.stream()
        .sorted()
            .forEach(System.out::println);
    }
}

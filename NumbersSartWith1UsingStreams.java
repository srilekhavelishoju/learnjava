package EdyodaPractice.Streams;

import java.util.Arrays;
import java.util.List;

public class NumbersSartWith1UsingStreams
{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(11,50,12,43,45,67,89,42);
        list.stream()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }

}

package EdyodaPractice.Streams;

import java.util.stream.*;
import java.util.Arrays;
import java.util.*;

public class EvenNumbersUsingStreams
{
    public static void main(String[] args) 
    {
        List<Integer> myList=Arrays.asList(10,20,12,48,49,50);
        myList.stream()
        .filter(n->n%2==0)
        .forEach(System.out::println);
    }
}

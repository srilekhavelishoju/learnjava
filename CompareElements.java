package Edyodaprograms.Collection.CollectionsAssignment;
import java.io.*;
import java.util.*;
public class CompareElements
{
    public static void main(String[] args)
    {
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(22);
        l.add(21);
        l.add(26);
        l.add(12);
        l.add(6);
        int minimum=Collections.min(l);
        int maximum=Collections.max(l);

        if(minimum==maximum)
        {
            System.out.println("elements are equal");
        }
        else
        {
            System.out.println("min value of our list:" + minimum);
        }
            System.out.println("max value of list:"+ maximum);
        }

    }


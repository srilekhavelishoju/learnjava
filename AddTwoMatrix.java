package Edyodaprograms;

import java.util.Scanner;

public class AddTwoMatrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m,n,r,c;
        //accepting order of matrix
        System.out.println("Enter The Order Of Matrix:");
        m=sc.nextInt();
        n=sc.nextInt();
        //allocating memory for matrix
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int res[][]=new int[m][n];
        //accepting values for a matrix
        System.out.println("enter values for a matrix a:");
        for(r=0;r<m;r++)
        {
            for (c=0;c<n;c++)
            {
                a[r][c] = sc.nextInt();
            }
        }

        //accepting values for matrix b
        System.out.println("enter values for matrix b:");
        for(r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                a[r][c]=sc.nextInt();
            }
        }

        for(r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                res[r][c]=a[r][c]+b[r][c];
            }
        }
        //display the matrix
        System.out.println("sum of Matrix:");
        for(r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                System.out.println(res[r][c]+"\t");
            }
        }
        System.out.println();
    }

}

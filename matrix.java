
import java.util.Scanner;

public class matrix {
    Scanner sc=new Scanner(System.in);
       int a[][]=new int [3][3];
       int b[][]=new int [3][3];
       int c[][]=new int [3][3];
   
       void Getdata()
       {
       int i,j;
       System.out.println("Enter the elements of first matrix:");
        for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
          {
            a[i][j] =sc.nextInt();
          }
        }

        System.out.println("First matrix is:");
        for(i=0;i<3;i++)
         {
         for(j=0;j<3;j++)
          {
            System.out.print(" "+a[i][j]);
          }
          System.out.println();
         }
       
        System.out.println("Enter the elements of second matrix:"); 
        for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
          {
            b[i][j] =sc.nextInt();
          }
        }
        System.out.println("Second matrix is:");
        for(i=0;i<3;i++)
         {
         for(j=0;j<3;j++)
          {
            System.out.print(" "+b[i][j]);
          }
          System.out.println();
         }
       }

       void Add()
       {
        int i,j;
        for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
          {
            c[i][j]=(a[i][j]*b[i][j]);
          }
        }
        System.out.println("Additon of two matrices is:");
        for(i=0;i<3;i++)
         {
         for(j=0;j<3;j++)
          {
            System.out.print(" "+c[i][j]);
          }
          System.out.println();
         }

       }

       void Sub()
       {
        int i,j;
        for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
          {
            c[i][j]=a[i][j]-b[i][j];
          }
        }
        System.out.println("Subtraction of two matrices is:");
        for(i=0;i<3;i++)
         {
         for(j=0;j<3;j++)
          {
            System.out.print(" "+c[i][j]);
          }
          System.out.println();
         }

       }

       void  Multiplication()
       {
        int i,j,k;
        for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
          {
            c[i][j]=0;
            for(k=0;k<3;k++)
            {
            c[i][j]+=(a[i][k]*b[k][j]);
            }
          }
        }
        System.out.println("Multiplication two of matrices is:");
        for(i=0;i<3;i++)
        {
        for(j=0;j<3;j++)
         {
           System.out.print(" "+c[i][j]);
         }
         System.out.println();
        }
       
       }

       void Division()
       {
        int i,j;
        for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
          {
            c[i][j]=a[i][j]/b[i][j];
          }
        }
        System.out.println("Division of two matrices is:");
        for(i=0;i<3;i++)
         {
         for(j=0;j<3;j++)
          {
            System.out.print(" "+c[i][j]);
          }
          System.out.println();
         }
       }

       void Transpose()
       {
        int i,j;
        for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
          {
            c[i][j]=a[j][i];
          }
        }
        System.out.println("Transpose of  of  matrix A  is:");
        for(i=0;i<3;i++)
         {
         for(j=0;j<3;j++)
          {
            System.out.print(" "+c[i][j]);
          }
          System.out.println();
         }
       }
    }

class Operation{
public static void main(String[] args)
 {
  matrix m1=new matrix();
  m1.Getdata();
  m1.Add();
  m1.Sub();
  m1.Multiplication();
  m1.Division();
  m1.Transpose();
 }
}


package com.company;

import java.util.Scanner;

public class SumAndAverageMarks {

    public static void main(String[] args) {
        int stu[][]=new int[3][3];
        int sum=0,j,sumA=0,sumB=0,sumC=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter student 1 marks");
        for (int i = 0; i < 3; i++) {
            System.out.println("A,B,C marks");
            for (j = 0; j < 3; j++) {
                stu[i][j] = obj.nextInt();
                sum = sum + stu[i][j];
            }
        }
        System.out.println("sum of all subject marks="+sum);
        float avg=sum/9;
        System.out.println("Average of toatal marka="+avg);

        for(int k=0;k<3;k++)
        {
            sumA=sumA+stu[0][k];
        }
        System.out.println("sum of A="+sumA);
        float avgA=sumA/3;
        System.out.println("avgA="+avgA);
        for(int l=0;l<3;l++)
        {
            sumB=sumB+stu[1][l];
        }
        System.out.println("sum of B="+sumB);
        float avgB=sumB/3;
        System.out.println("avgB="+avgB);
        for(int m=0;m<3;m++)
        {
            sumC=sumC+stu[2][m];
        }
        System.out.println("sum of C="+sumC);
        float avgC=sumC/3;
        System.out.println("avgC="+avgC);
    }

}
1
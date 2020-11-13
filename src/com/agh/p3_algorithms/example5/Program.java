package com.agh.p3_algorithms.example5;

public class Program {

    public String printSpiralMatrix(int matrix[][]){
        // CASE: EMPTY MATRIX
        if(matrix==null)
            return "provide proper matrix";

        //TOP, BOTTOM
        int m=matrix.length;
        int t=0;
        int b=m-1;

        //LEFT, RIGHT
        int n=matrix[0].length;
        int l=0;
        int r=n-1;


        String s="";

        for(int j=0; j<(m-1)*(n-1); j++)
        {

            for(int i=r;i>=l;i--)
                s+=matrix[t][i]+" ";
            t++;

            for(int i=t;i<=b;i++)
                s+=matrix[i][l]+" ";
            l++;

            for(int i=l;i<=r;i++)
                s+=matrix[b][i]+" ";
            b--;

            for(int i=b;i>=t;i--)
                s+=matrix[i][r ]+" ";
            r--;
        }
        System.out.println(s);
        return s;
    }

    public int[][] generateMatrix(int n, int m) throws Exception
    {
        if(n<=0||m<=0){
            throw new Exception("wrong size of matrix");
        }
        int matrix[][]=new int[n][m];
        for(int i=0, number=0; i<n; i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=number;
                number++;
            }
        }
        return matrix;
    }

    public String printMatrix(int matrix[][])
    {
        int m=matrix.length;
        int n=matrix[0].length;
        String s="";
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                s+=matrix[i][j]+" ";
            }
            System.out.println(s);
            s="";
        }

        return s;
    }

    public void execute() {
        try {
            //int[][] matrix = generateMatrix(4,4);
            //printMatrix(matrix);

            int[][] matrix2 = {
                    { 1,  2,  3,  4,  5},
                    { 6,  7,  8,  9, 10},
                    {11, 12, 13, 14, 15},
                    {16, 17, 18, 19, 20},
                    {21, 22, 23, 24, 25}
            };

            printMatrix(matrix2);

            System.out.println("Printing spiral matrix..");
            printSpiralMatrix(matrix2);
        }catch (Exception e){

        }

    }


}

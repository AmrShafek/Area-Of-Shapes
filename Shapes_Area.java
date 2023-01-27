package amrshafekelhady;
import static amrshafekelhady.Matrix.input;
import java.util.Scanner;
public class Shapes_Area {
public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);  
        int option  ;
        boolean q=true;
      while (q)
     {
     System.out.println("enter Which Program you want ");
     System.out.println("1-Area of Shapes  2-operation of matrix  3-End");
     option=input.nextInt();

switch (option)
{
case 1:
       Shape op1 =new  Shape();
       int option2  ; 
       System.out.println("1-circle  2-rectangle   3-cube");
       System.out.println("4-square  5-rectangular_prism   6-cylinder");
       System.out.println("7-cone  8-spher   9-hemi_spher ");
       System.out.println("10-triangle  11-parallelogram   12-trabezium  13-ellipse");
       option2=input.nextInt();
       
       switch(option2)
       {

           case 1:
                  op1.circle();
           break;
           case 2:
                  op1.rectangle();
           break; 
           case 3:
                  op1.cube();
           break;            
            case 4:
                  op1.square();
           break;           
           case 5:
                  op1.rectangular_prism();
           break;            
           case 6:
                  op1.cylinder();
           break;            
           case 7:
                  op1.cone();
           break;
           case 8:
                  op1.spher();
           break;           
           case 9:
                  op1.hemi_spher();
           break;            
           case 10:
                  op1.triangle();
           break;           
           case 11:
                  op1.parallelogram();
           break;           
           case 12:
                  op1.trabezium();
           break;           
           case 13:
                  op1.ellipse();
           break;               
       }
break;


       case 2:
            int size,size2,option3;
     
       System.out.println("Please enter the size of no of rows for first matrix");
       int rows1=input.nextInt();
       System.out.println("Please enter the size of no of columns for first matrix");
       int cols1=input.nextInt();
       int A [][]=new int [rows1][cols1];
       
        for(int row=0 ;row<A.length;row++)
        for(int col=0 ;col<A[0].length;col++)
        {
           System.out.println("Please enter the row no "+(row+1)+ " And the column no "+ (col+1));
           A[row][col]=input.nextInt();
        }
       System.out.println("Please enter the size of no of rows for Second matrix");
       int rows2=input.nextInt();
       System.out.println("Please enter the size of no of columns for Second matrix");
       int cols2=input.nextInt();
       int B [][]=new int [rows2][cols2];
        for(int row2=0 ;row2<B.length;row2++)
        for(int col2=0 ;col2<B[0].length;col2++)
        {
           System.out.println("Please enter the row no "+(row2+1)+ " And the column no "+ (col2+1));
           B[row2][col2]=input.nextInt();
        }
                   System.out.println("Press '1' to summing  ");
                   System.out.println("Press '2' to substracting ");
                   System.out.println("Press '3' to multiblication ");
          option3 = input.nextInt();
           Matrix op=new Matrix();
        switch(option3)
            
{
    case 1 : //summing
       
         int Z [][]=new int [rows2][cols2];
        op.printMatrix(A, rows1, cols1);
        System.out.println("  ");
        op.printMatrix(B, rows2, cols2); 
         System.out.println("  ");
        Z=op.sum_array(A, B, rows2,cols2);

        op.printMatrix(Z, rows2, cols2);   
     break;
    case 2 :
         
         int K [][]=new int [rows2][cols2];
        op.printMatrix(A, rows1, cols1);
        System.out.println("  ");
        op.printMatrix(B, rows2, cols2); 
         System.out.println("  ");
        K=op.sub_array(A, B, rows2,cols2);

        op.printMatrix(K, rows2, cols2);   
     
     break;
    case 3:
                 int  L [][]=new int [rows1][cols2];
        op.printMatrix(A, rows1, cols1);
        System.out.println("  ");
        op.printMatrix(B, rows2, cols2); 
         System.out.println("  ");
         if (cols1==rows2){
             
        L=op.multi(A, B, cols1,rows2);

        op.printMatrix(L, rows1, cols2);}
     else
                System.out.println("There is error in deminsion of the matrix  ");
      
     break;     
     
     
} 
           
break;       
case 3:
    q= false;
    System.out.println("The program is ended ");
    break;
 }

}
   
    }

   }
 


    class Shape {
    static Scanner input = new Scanner(System.in);
      public static final double pi=3.14;
      void circle()
    {
      double area ;
      float r;
      System.out.println("Enter value of the radious ");
      r=input.nextFloat();
      area=pi*r*r; 
      System.out.println("the area =  "+area);
  
    }
      void rectangle()
    {
        float x,y;
      double area ;
      System.out.println("Enter value of the length ");
      x=input.nextFloat();
       System.out.println("Enter value of the width ");
      y=input.nextFloat();
      area = x*y;
      System.out.println("the area =  "+area);
    }

      void cube()
    {
      float x;
      double area ;
      System.out.println("Enter value of the length of the edge ");
      x=input.nextFloat();
      area =6* x;
      System.out.println("the area =  "+area);
    }     

      void square()
    {
      float x;
      double area ;
      System.out.println("Enter value of the length of the edge ");
      x=input.nextFloat();
      area =x*x;
      System.out.println("the area =  "+area);
    }       

      void  rectangular_prism()
    {
       float x, y, z;
      double area ;
      System.out.println("Enter value of the length ");
      x=input.nextFloat();
       System.out.println("Enter value of the width ");
      y=input.nextFloat();
       System.out.println("Enter value of the high ");
      z=input.nextFloat();      
      area =2*(x*y+x*z+y*z);
      System.out.println("the area =  "+area);
    }      
      void  cylinder()
    {
      float r,h;
      double area ;
      System.out.println("Enter value of the radious ");
      r=input.nextFloat();
      System.out.println("Enter value of the high ");

      h=input.nextFloat();      
      area =2*(pi*r)*(r+h);
      System.out.println("the area =  "+area);
    }
     
      void  cone()
    {
        float r,h;
      double area ;
      System.out.println("Enter value of the radious ");
      r=input.nextFloat();
      System.out.println("Enter value of high ");
      h=input.nextFloat();      
      area =(r*pi)*(r+h);
      System.out.println("the area =  "+area);
    }      
    
      void  spher()
    {
      float r;
      double area ;
      System.out.println("Enter value of the radious ");
      r=input.nextFloat();
      area =4*pi*r*r;
      System.out.println("the area =  "+area);
    }      
        
      void  hemi_spher()
    {
      float r;
      double area ;
      System.out.println("Enter value of the radious ");
      r=input.nextFloat();
      area =3*pi*r*r;
      System.out.println("the area =  "+area);
    }     
    
      void  triangle()
    {
      float b,h;  
      double area ;
      System.out.println("Enter value of the base ");
      b=input.nextFloat();
      System.out.println("Enter value of high ");
      h=input.nextFloat();      
      area =.5*b*h;
      System.out.println("the area =  "+area);
    }       
     
      void  parallelogram()
    {
      float b,h;  
      double area ;
      System.out.println("Enter value of the base ");
      b=input.nextFloat();
      System.out.println("Enter value of vertical high ");
      h=input.nextFloat();      
      area =b*h;
      System.out.println("the area =  "+area);
    }      
     
      void  trabezium()
    {
      float a,b,h;
      double area ;
      System.out.println("Enter the length of parllel sides");
      a=input.nextFloat();
      b=input.nextFloat(); 
      System.out.println("Enter the high");
      h=input.nextFloat(); 

      area =.5*(a+b)*h;
      System.out.println("the area =  "+area);
    }      
     
      void  ellipse()
    {
      float a,b;  
      double area ;
      System.out.println("Enter the 1/2 of minor axis ");
      a=input.nextFloat();
      System.out.println("Enter the 1/2 of major axis ");
      b=input.nextFloat();      
      area =pi*a*b;
      System.out.println("the area =  "+area);
    }     
    } 
     
  class Matrix {
   static Scanner input = new Scanner(System.in);


       public int[][] sum_array(int A[][],int B[][],int rows,int cols)
    {
            int C [][]=new int [rows][cols]; 
        for(int i=0 ;i<rows;i++)
        for(int j=0 ;j<cols;j++)
        C[i][j]=A[i][j]+B[i][j];
        
        return C;
        
    
    }
       public int[][] sub_array(int A[][],int B[][],int rows,int cols)
    {
            int C [][]=new int [rows][cols]; 
        for(int i=0 ;i<rows;i++)
        for(int j=0 ;j<cols;j++)
        C[i][j]=A[i][j]-B[i][j];
        
        return C;
        
    
    }       
             public int[][] multi(int A[][],int B[][],int rows,int cols)
    {
            int C [][]=new int [rows][cols]; 
for (int i = 0; i < A.length; i++) { 
    for (int j = 0; j < B[0].length; j++) { 
        for (int k = 0; k < A[0].length; k++) { 
            C[i][j] += A[i][k] * B[k][j];
        }
    }
}
        
        return C;
        
    
    } 
    
    public void printMatrix(int matrix[][],int rowSize,int colSize)
    {
        for (int i = 0; i < rowSize; i++)
        {
            for (int j = 0; j < colSize; j++)
                System.out.print(matrix[i][j] + " ");
 
            System.out.println();
        }
    }       
    
   }

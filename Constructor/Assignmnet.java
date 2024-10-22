import java.util.*;

class solution
{
    int crr[][];
    int d;
    int c;
   void set(int brr[][],int a,int b)
   {
      crr=brr;
      d=a;
      c=b;
   }
   void find()
   {
      int count=0;
      for(int i=0;i<d;i++)
      {
        for(int j=0;j<c;j++)
        {
            if(crr[i][j]==1)
            {
                count++;
            }
        }
      }
      System.out.println(count);
   }

}
public class Assignmnet
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the number of rows::");
        int iRow=sobj.nextInt();

        System.out.println("Enter the number of column::");
        int iCol=sobj.nextInt();

        int arr[][]=new int[iRow][iCol];
        
        System.out.println("Enter values in matrix::");
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                arr[i][j]=sobj.nextInt();
            }
        }

        System.out.println("The elements are::");
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                System.out.println(arr[i][j]);
            }
        }

        solution st=new solution();
        st.set(arr,iRow,iCol);
        st.find();
        
          
    }
}
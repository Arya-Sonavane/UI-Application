
/* 
//  MAX Element

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();
        int arr[]=new int[iSize];
        System.out.println("Enter values into arrya::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d ",arr[i]);
        }

        int Max=arr[0];
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>Max)
            {
                Max=arr[j];
            }
        }
        System.out.printf("\n%d",Max);


    }
}

//  MIN Element

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();
        int arr[]=new int[iSize];
        System.out.println("Enter values into arrya::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d ",arr[i]);
        }

        // 2 1 3 5

        int Min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(Min>arr[i])
            {
                 Min=arr[i];
            }
        }
        System.out.printf("%d",Min);
    }
}



import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();
        int arr[]=new int[iSize];
        System.out.println("Enter values into arrya::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d \t",arr[i]);
        }

        // 1 2 3 4 

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.printf("%d",arr[i]);
            }
            
        }
    }
}



//! Sum of all array Elemenets
import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();
        int arr[]=new int[iSize];
        System.out.println("Enter values into arrya::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d \t",arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.printf("\n The Sum::%d",sum);
    }
}



//! Max and Min Elements

array= 5 9 11 4 6
Min=4
Max=11

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();
        int arr[]=new int[iSize];
        System.out.println("Enter values into arrya::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d \t",arr[i]);
        }
        int Max=arr[0];
        int Min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if( Max<arr[i])
            {
                Max=arr[i];
            }
            if(Min>arr[i])
            {
                Min=arr[i];
            }
        }
        System.out.printf("Min:%d Max:%d",Min,Max);
    }
}



//! WAP to enter the five element and display in ascending order

// Initial Array= 5 3 6 4 1
// After ascending = 1 3 4 5 6

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();
        int arr[]=new int[iSize];
        System.out.println("Enter values into arrya::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d \t",arr[i]);
        }
        
        for(int i=0;i<arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
           if(arr[i]>arr[j])
           {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
           }
           }
        }
    
        System.out.println("After sorting Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d \t",arr[i]);
        }
    }
}



//! WAP to enter the five element and display in decending order

// Initial Array= 5 3 6 4 1
// After ascending = 6 5 4 3 1

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();
        int arr[]=new int[iSize];
        System.out.println("Enter values into arrya::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d \t",arr[i]);
        }
        
        for(int i=0;i<arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
           if(arr[i]<arr[j])
           {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
           }
           }
        }
    
        System.out.println("\n After sorting Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d \t",arr[i]);
        }
    }
}



//!   WAP to insert the element on specified position in array ?

// Initial Array= 10 20 30 40 50 0
// After change = 10 20 100 30 40 50
//Index=2
//Value=100

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=sobj.nextInt();
        }

        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the index and value::");
        int Index=sobj.nextInt();
        int value=sobj.nextInt();

        
        // Shifting logic
        for(int i=Index+2;i>=Index;i--)  [10 20 30 40 50]
        {
            arr[i+1]=arr[i];
        }

        arr[Index]=value;
    
        System.out.println("After sorting Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d \t",arr[i]);
        }
    }
}

//! Write a program to reverse a array
10 20 30 40 50     ->  50 40 30 20 10

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   
        
        //Revrse logic
        int Min=arr.length;
        
        for(int i=0;i<Min/2;i++)     // 10 20 30 40 50     ->  50 40 30 20 10
        {
            int temp=arr[i];
            arr[i]=arr[Min-i-1];
            arr[Min-i-1]=temp;
        }

        System.out.println("after change::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   

        
    }
}


//!  WAP to enter the 10 element array and print the repeated element ?
import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }



        
    }
}



//!   Write a program in C to separate odd and even integers in separate arrays ?

Input the number of elements to be stored in the array :5
Input 5 elements in the array :
element - 0 : 25
element - 1 : 47
element - 2 : 42
element - 3 : 56
element - 4 : 32
Expected Output :
The Even elements are :
42 56 32
The Odd elements are :
25 47


import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        int a[]=new int[5];
        int b[]=new int[5];
        int index1=0;
        int index2=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                a[index1]=arr[i];
                index1++;
            }
            if(arr[i]%2!=0)
            {
                b[index2]=arr[i];
                index2++;
                
            }
        }
        
        System.out.println("****************************");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("****************************");
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        
    }
}




import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Enter Index:");
        int index=sobj.nextInt();
        //delete logic
        for(int i=0;i<arr.length-1;i++)
        {
            if(i>=index)
            {
               arr[i]=arr[i+1];
            }
        }
        
        System.out.println("***************************");

        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}



import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

      
        //Sort the array in decending order order

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        
        System.out.println("***************************");

        System.out.println("Second largest number is::"+arr[1]);
    
    }
}

Write a program in C to find a pair with given sum in the array.
Expected Output :
The given array : 6 8 4 -5 7 9
The given sum : 15
Pair of elements can make the given sum by the value of index 0 and 5

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   
          
        
        int sum=15;
     
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.printf("%d %d ",i,j);
                }
            }
        }
        
    }
}

Write a program to enter the 5 values in ascending order and store in array and find out the
missing element from array?

import java.util.*;
public class ArrayPractice1
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }
        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   
          
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=arr[i];j<arr[i+1];j++)
            {
                if(j==arr[i] || j==arr[i+1])
                {
                    continue;
                }
                System.out.printf("%d",j);
            }
        }
        
    }
}


import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }
        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   

        System.out.println("Enter element whoes occurance want to calculate::");
        int value=sobj.nextInt();
        int count=0;
          
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value)
            {
                count++;
            }
        }
        if(count>4)
        {
        System.out.println(count);
        }
        else
        {
            System.out.println("No");
        }      
    }
}



//! Write a program in c to count the total number of duplicate elements in array
import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }
        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }

    }
}


//!  Write a program in C to prit unique elements in an array

// 3 2 2 5 => 3 5


import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];

        System.out.println("Enter values into array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }
        
        System.out.println("Elements are::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   

        System.out.println("!!!!!!!!!!!!!!!!!!");

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        } 

        
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");     

        for(int l=0;l<arr.length-1;l++)                           // 5 3 2 2 
        {
            if(arr[l]==arr[l+1])
            {
                arr[l]=-1;
                arr[l+1]=-1;
            }
            
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=-1)
            {
                System.out.println(arr[i]);
            }
        }
}
}




//! Write a program to merge two arryas of the same size sorted in descending order.

//first array=1 2 3   second=1 2 3 result=>3 3 2 2 1 1 

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];
        int brr[]=new int[iSize];

        System.out.println("Enter values into firts array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Enter values into second array::");
        for(int i=0;i<brr.length;i++)
        {
            brr[i]=sobj.nextInt();
        }
        
        
        System.out.println("Elements of firts array::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   

        System.out.println("Elements of second array::");
        for(int i=0;i<brr.length;i++)
        {
            System.out.println(brr[i]);
        }   


        // create result array of size(arr.length+brr.length)

        int merge[]=new int[arr.length+brr.length];

        for(int i=0;i<merge.length;i++)
        {
           if(i<arr.length)
           {
             merge[i]=arr[i];
           }
           else
           {
             merge[i]=brr[i-3];             // 1 2 3 1 2 3
           }
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        for(int i=0;i<merge.length;i++)
        {
            System.out.println(merge[i]);
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        for(int i=0;i<merge.length;i++)
        {
            for(int j=i+1;j<merge.length;j++)
            {
                if(merge[i]<merge[j])
                {
                    int temp=merge[i];
                    merge[i]=merge[j];
                    merge[j]=temp;
                }
            }
        }

        for(int i=0;i<merge.length;i++)
        {
            System.out.println(merge[i]);
        }
   }
}



//! Write a program to count occurance of number

// 25 12 43 => 1 1 1 

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];
       
        System.out.println("Enter values into firts array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Elements of firts array::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   

        //Logic 


        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(count);
                    count++;
                }
                
            }
            
        }        
   }
}




//! Write a program to insert a element in arrya (acending order) 

//2 5 7 9 11   insert 8 => 2 5 7 8 9 11

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];
       
        System.out.println("Enter values into firts array::");
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Elements of firts array::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   


        //Logic                                      //2 5 7 9 11   insert 8 => 2 5 7  8  9  11

        System.out.println("Enter value::");
        int value=sobj.nextInt();


        int pos=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>value)
            {
                pos++;
            }
        }

        for (int i = arr.length - 1; i > ipos+1; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos+1]=value;
    
        //System.out.println(pos);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   
        
   }
}


//! Write a program in C to insert value in the array
// 1 8 7 10    inserted=5   final =>1 5 8 7 10

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];
       
        System.out.println("Enter values into firts array::");
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Elements of firts array::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   


        //Logic                                       

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println("Enter value::");
        int value=sobj.nextInt();                       // 1 8 7 10  =>1 5 8 7 10
        
        int pos=0;
        for(int i=0;i<arr.length;i++)
        {
            if(value<arr[i])
            {
               pos++;
               break;
            }
        }
         System.out.println(pos);
        // arr[pos]=5;

        for(int i=arr.length-1;i>1;i--)
        {
              arr[i]=arr[i-1];
        }

        arr[pos]=5;

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        } 
   }
}


*/

import java.util.*;
public class ArrayPractice
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array::");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];
       
        System.out.println("Enter values into firts array::");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sobj.nextInt();
        }

        System.out.println("Elements of firts array::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }   

        System.out.println("Enter from you want to rotate the array::");
        int iPos=sobj.nextInt();

        int a[]=new int[arr.length];
        int b[]=new int[arr.length];

        int ans[]=new int[arr.length];
        int l=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i<iPos)
            {
                a[i]=arr[i];
            }
            else
            {
                    
                    b[l]=arr[i];
                    l++;
            }
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        } 

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        } 

        for(int i=0;i<ans.length;i++)
        {
            ans[i]=b[i]w;
        }

        
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        } 

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        int count=0;
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]!=0)
            {
                count++;
            }
        }


        System.out.println("!!!!!!"+count);

        for(int i=0;i<ans.length;i++)
        {
            ans[count]=a[i];
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!");
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        } 
   }
}

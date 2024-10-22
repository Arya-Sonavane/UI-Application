
/* 


1
2
3
4
5 4 3 2 1




import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(j==1)
                {
                    System.out.printf("%d ",i);
                }
                if(i==5)
                {
                    if(i-j==0)
                    {
                        return;
                    }
                    System.out.printf("%d ",i-j);
                }
               
            }
            System.out.printf("\n");
        }
    }
}




* * * * *
  * * * *
    * * *
      * *
        *

   
import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(i<=j)
                {
                    System.out.printf("* ");
                }
                else
                {
                    System.out.printf("  ");
                }
                 
            }
            System.out.printf("\n");
        }
    }
}
        




* * * * *
* * * *
* * *
* *
*

// Approach 1
   
import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(i<=j)
                {
                    System.out.printf("* ");
                }
                else
                {
                    System.out.printf("");    //Not Given Space hence new line * comes forword
                }
                 
            }
            System.out.printf("\n");
        }
    }
}


// Approach 2

import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(j<=6-i)
                {
                    System.out.printf("* ");
                }
                else
                {
                    System.out.printf(" ");    //Not Given Space hence new line * comes forword
                }
                 
            }
            System.out.printf("\n");
        }
    }
}




*
* *
* * *
* * * *
* * * * *


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(i>=j)
                {
                    System.out.printf("* ");
                }
                else
                {
                    System.out.printf("");    //Not Given Space hence new line * comes forword
                }
                 
            }
            System.out.printf("\n");
        }
    }
}



        *
      * *
    * * *
  * * * *
* * * * *
          In this type of pattern focus on front spaces if you are not getting answer adjust it.


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(j>=6-i)
                {
                    System.out.printf("* ");
                }
                else
                {
                    System.out.printf("  ");    //
                }
                 
            }
            System.out.printf("\n");
        }
    }
}



* * * * * *
*       *
*     *
*   *
* *
*

import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(i==1 || j==1 || j==7-i)
                {
                    System.out.printf("* ");
                }
                else
                {
                    System.out.printf("  ");    //
                }
                 
            }
            System.out.printf("\n");
        }
    }
}




      *
    * * *
  * * * * *
* * * * * * * 


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(j>=6-i && j<=4+i)
                {
                    System.out.printf("* ");
                }
                else
                {
                    System.out.printf("  ");    
                }
                 
            }
            System.out.printf("\n");
        }
    }
}



    *
   * *
  * * *
 * * * *
* * * * *

import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        boolean b=false;
        for(i=1;i<=iRow;i++)
        {
            b=true;
            for(j=1;j<=iCol;j++)
            {
                if((j>=6-i && j<=4+i)&&b)
                {
                    System.out.printf("*");
                    b=false;
                }
                else
                {
                    System.out.printf(" ");
                    b=true;    
                }
                 
            }
            System.out.printf("\n");
        }
    }
}

* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        boolean b=false;
        for(i=1;i<=iRow;i++)
        {
            b=true;
            for(j=1;j<=iCol;j++)
            {
                if((j>=i && j<=12-i)&&b)
                {
                    System.out.printf("* ");
                    b=false;
                }
                else
                {
                    System.out.printf("  ");
                    b=true;    
                }
                 
            }
            System.out.printf("\n");
        }
    }
}




       *
     *   *
    *     *
   *        *
  *          *
*  *  *  *  *  *


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        boolean b=false;
        for(i=1;i<=iRow;i++)
        {
            b=true;
            for(j=1;j<=iCol;j++)
            {
                if((j==7-i || j==5+i || i==iRow)&&b)
                {
                    System.out.printf("*");
                    b=false;
                }
                else
                {
                    System.out.printf(" ");
                    b=true;    
                }
                 
            }
            System.out.printf("\n");
        }
    }
}



1
1 2
1 2 3
1 2 3 4
1 2 3 4 5



import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
           
            for(j=1;j<=iCol;j++)
            {
                if(i>=j)
                {
                    System.out.printf("%d ",j);
                }
                else
                {
                    System.out.printf("");
                }
                 
            }
            System.out.printf("\n");
        }
    }
}


1 2 3 4 5
1 2 3 4
1 2 3
1 2
1


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
           
            for(j=1;j<=iCol;j++)
            {
                if(j<=6-i)
                {
                    System.out.printf("%d ",j);
                }
                else
                {
                    System.out.printf("");
                }
                 
            }
            System.out.printf("\n");
        }
    }
}



1
1 2
1   3
1     4
1 2 3 4 5 



import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
           
            for(j=1;j<=iCol;j++)
            {
                if( j==1 || i==iRow)
                {
                    System.out.printf("%d",j);
                }
                else if(i==j)
                {
                    System.out.printf("%d",j);
                }
                else
                {
                    System.out.printf(" ");
                }
                 
            }
            System.out.printf("\n");
        }
    }
}

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5




import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        int num=1;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(i>=j)
                {
                System.out.printf("%d ",j);
                }
                else
                {
                    System.out.printf("");
                }
            }
            System.out.printf("\n");
        }
    }
}





import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        int num=1;
        for(i=1;i<=iRow;i++)
        {
            for(j=iCol;j>=1;j--)
            {
                if(j<=6-i)
                {
                    System.out.printf("%d",6-j);
                }
                else
                {
                    System.out.printf("");
                }
            }
            System.out.printf("\n");
        }
    }
}



import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        int num=0;
        int num2=0;
        for(i=1;i<=iRow;i++)
        {
            num=i;
            for(j=1;j<=iCol;j++)
            {
                if((j>=6-i && j<=5))
                {
                    System.out.printf("%d",num);
                    num++;
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}


   ****
  ****
 ****
****


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        int num=0;
        for(i=1;i<=iRow;i++)
        {
            
            for(j=1;j<=iCol;j++)
            {
                if(j>=5-i && j<=8-i)
                {
                    System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}

        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
      //  int iRow=sobj.nextInt();
        //int iCol=sobj.nextInt();
        int i,j=0;
        int num=0;
        int num2=0;
        for(i=1;i<=5;i++)
        {
            num=i;
            for(j=1;j<=9;j++)
            {
                if((j>=6-i && j<=4+i))
                {
                     if(j<5)
                     {
                        System.out.print(num++);
                     }
                     else{
                        System.out.print(num--);
                     }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



1 2 3 4 5
2     5
3   5
4 5
5

import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
      //  int iRow=sobj.nextInt();
        //int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==1)
                {
                    System.out.printf("%d",j);
                }
                else if(j==1)
                {
                    System.out.printf("%d",i);
                }
                else if(j==6-i)
                {
                    System.out.printf("%d",5);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}






// Patterns on numbers::




1
2 3
4 5 6
7 8 9 10
11 12 13 14


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        int num=1;
        for(i=1;i<=iRow;i++)
        {
            for(j=iCol;j>=1;j--)
            {
                if(i>=j)
                {
                   System.out.print(num);
                   num++;
                }
            }
            System.out.printf("\n");
        }
    }
}

    1    
   1 2
  1   3
 1     4 
1 2 3 4 5



import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        int k=2,n=2;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(j==6-i)
                {
                    System.out.printf("%d",1);
                }
                else if(j==4+i)
                {
                    System.out.printf("%d",k);
                    k++;
                }
                else if(i==5 && j%2!=0) 
                {
                    System.out.printf("%d",n);
                    n++;
                }
                else{
                    System.out.printf(" ");
                }
                 
            }
            System.out.printf("\n");
        }
    }
}


********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5****


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,j=0;
        boolean b=false;
        for(i=1;i<=iRow;i++)
        {
            b=true;
            for(j=1;j<=iCol;j++)
            { 
                if((j>=10-i && j<=8+i)&&b)
                {
                    System.out.printf("%d",i);
                    b=false;
                }
                else
                {
                    System.out.printf("*");
                    b=true;
                }

            }
            System.out.printf("\n");
        }
    }
}


1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1



import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,k,j=0;
        for(i=1;i<=iRow;i++)
        {
            int num=1;
            for(j=1;j<=iCol;j++)
            { 
                if(i>=j)
                {
                    System.out.printf("%d ",num);
                    num++;
                }
            }
            for(k=i-1;k>=1;k--)
            {
                System.out.printf("%d ",k);
            }
            System.out.printf("\n");
        }
    }
}


A
A B A
A B C B A
A B C D C B A
A B C D E D C B A


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,k,j=0;
        for(i=1;i<=iRow;i++)
        {
            int num=1;
            for(j=1;j<=iCol;j++)
            { 
                if(i>=j)
                {
                    System.out.printf("%c ",64+num);
                    num++;
                }
            }
            for(k=i-1;k>=1;k--)
            {
                System.out.printf("%c ",64+k);
            }
            System.out.printf("\n");
        }
    }
}
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1



import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=sobj.nextInt();
        int iCol=sobj.nextInt();
        int i,k,j=0;
        for(i=1;i<=iRow;i++)
        {
            int num=1;
            for(j=1;j<=iCol;j++)
            { 
                if(j>=6-i && j<=5)
                {
                    System.out.printf("%d ",num);
                    num++;
                }
                if(j<6-i)
                {
                    System.out.printf("  ");
                }
            }
            for(k=i-1;k>=1;k--)
            {
                System.out.printf("%d ",k);
            }

            System.out.printf("\n");
        }
    }
}

   
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *

import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        int k=9;
        boolean b=false;
        for(i=1;i<=5;i++)
        {
            b=true;
            for(j=1;j<=9;j++)
            {
                if((j>=6-i && j<=4+i)&& b)
                {
                   System.out.printf("*");
                   b=false;   
                }
                //  else if((j>=i && j<=10-i)&& b)
                // {
                //    System.out.printf("*");
                //    b=false; 
                // }
                else
                {
                    System.out.printf(" ");
                    b=true;
                }
            }
            System.out.printf("\n");
        }
        for(i=1;i<=5;i++)
        {
            b=true;
            for(j=1;j<=9;j++)
            {
                if((j>=i && j<=10-i)&& b)
                {
                   System.out.printf("*");
                   b=false; 
                }
                else
                {
                    System.out.printf(" ");
                    b=true;
                }
            }
            System.out.printf("\n");
        }
    }
}

     *
   *   *
  *     *
 *       *
*         *
*         *
 *       *
  *     *
   *   *
     * 


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=9;j++)
            {
                if(j==6-i || j==4+i)
                {
                   System.out.printf("*"); 
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        for(i=1;i<=5;i++)
        {
           
            for(j=1;j<=9;j++)
            {
                if(j==i || j==10-i)
                {
                   System.out.printf("*"); 
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i>=j)
                {
                   System.out.printf("*"); 
                }
            }
            System.out.printf("\n");
        }
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j<=6-i)
                {
                   System.out.printf("*"); 
                }
            }
            System.out.printf("\n");
        }
    }
}

3
4 4
5 5 5
6 6 6 6
5 5 5
4 4
3


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                if(i>=j)
                {
                   System.out.printf("%d",2+i);
                }
            }
            System.out.printf("\n");
        }
        for(i=1;i<=3;i++)
         {
            for(j=1;j<=3;j++)
             {
                 if(j<=4-i)
                 {
                    System.out.printf("%d",6-i); 
                 }
             }
             System.out.printf("\n");
         }
    }
}



1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1

import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        int k=0;
        int l=3;
        for(i=1;i<=4;i++)
        { 
           for(j=1;j<=7;j++)
            {
                if(j<=k+i)
                {
                    if((j%2)!=0)
                    {
                        System.out.printf("%d",i);
                      
                    }
                    else
                    {
                        System.out.printf("*");
                        
                    }
                    
                }
            }
            k++;
          
            System.out.printf("\n");
        }
        for(i=4;i>=1;i--)
        { 
           for(j=1;j<=7;j++)
            {
                if(j<=i+l)
                {
                    if((j%2)!=0)
                    {
                        System.out.printf("%d",i);
                      
                    }
                    else
                    {
                        System.out.printf("*");
                        
                    }
                    
                }
            }
            l--;
          
            System.out.printf("\n");
        }
    }
}

* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *


public class test
{ 
       public static void main(String x[])
    {     
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=10;j++)
            {
                if(j<=6-i || j>=5+i)
                {
                       System.out.printf("* ");
                }
                else{
                    System.out.printf("  ");
                }
         
            }
            System.out.println();
        } 
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=10;j++)
            {
                if(j<=i || j>=11-i)
                {
                       System.out.printf("* ");
                }
                else{
                    System.out.printf("  ");
                }
         
            }
            System.out.println();
        }       
	}
}	



*         *
**       **
***     ***
****   ****
***** *****
***** *****
****   ****
***     ***
**       **
*         *


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=10;j++)
            {
                if(i>=j || j>=11-i)
                {
                   System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        for(i=1;i<=5;i++)
         {
            for(j=1;j<=10;j++)
             {
                 if(j<=6-i || j>=5+i)
                 {
                    System.out.printf("*"); 
                 }
                 else
                 {
                    System.out.printf(" ");
                 }
             }
             System.out.printf("\n");
         }
    }
}


*******
**   **
* * * *
*  *  *
* * * *
**   **
*******

import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=7;i++)
        {
            for(j=1;j<=7;j++)
            {
                if(i==1 || i==7 || j==1 || j==7 || i==j || j==8-i)
                {
                   System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        
    }
}

        *
      * * *
    *   *   *
  *     *     *
* * * * * * * * *
  *     *     *
    *   *   *
      * * *
        *

import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=9;i++)
        {
            for(j=1;j<=9;j++)
            {
                if(j==5 || j==6-i || j==4+i || i==5 || (i>5 && j==i-4 || j==14-i)) 
                {
                   System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        
    }
}
    *
     *
      *
       *
*********
       *
      *
     *
    *


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=9;i++)
        {
            for(j=1;j<=9;j++)
            {
                if((i<=5 &&j==4+i) || i==5 ||(i>5 &&j==14-i)) 
                {
                   System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        
    }
}
        * 
      *
    *
  *
* * * * * * * * *
  *
    *
      *
        *


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        for(i=1;i<=9;i++)
        {
            for(j=1;j<=9;j++)
            {
                if((i<=5 &&j==6-i) || i==5 ||(i>5 && j==i-4)) 
                {
                   System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        
    }
}

   1
  2 3
 4 5 6
7 8 9 10


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        int k=1;
        boolean b=false;
        for(i=1;i<=4;i++)
        {
            b=true;
            for(j=1;j<=7;j++)
            {
                if((j>=5-i && j<=4+i)&&b) 
                {
                   System.out.printf("%d",k);
                   k++;
                   b=false;
                }
                else
                {
                    System.out.printf(" ");
                    b=true;
                }
            }
            System.out.printf("\n");
        }
        
    }
}
0                 0
0 1             0 1
0 1 0         0 1 0
0 1 0 1     0 1 0 1
0 1 0 1 0 0 1 0 1 0


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
      
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=10;j++)
            {
                if(i>=j||j>=11-i){
                    if(j%2==0)
                     System.out.printf("1");
                    else
                    System.out.printf("0");
                }
                else 
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        
    }
}


123454321
1234321
12321
121
1


import java.util.*;

public class test
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
       // int iRow=sobj.nextInt();
       //int iCol=sobj.nextInt();
        int i,j=0;
        int l=0;
        for(i=1;i<=5;i++)
        {
            int k=1;
            for(j=1;j<=9;j++)
            {
                   if(j<=10-(i+l))
                   { 
                      System.out.printf("%d",k);
                       if(j<6-i)
                       {
                          k++;
                       }
                       else
                       {
                         k--;
                       }
                   } 
            }
            l++;
            System.out.printf("\n");
                
        }
            
           
    }
        
}

*/


import java.util.*;
public class test
{
    public static void main(String arg[])
    {
        int i,j=0;
        char ch='\0';

        for(i=1;i<=5;i++)
        {
            ch='A';
            for(j=1;j<=9;j++)
            {
                if(j>=7-i && j<=i+3)
                {
                    System.out.printf(" ");
                }
                else
                {
                    
                    System.out.printf("%c",ch);
                }
                if(j<5)
                {
                    ch++;
                }
                else
                {
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
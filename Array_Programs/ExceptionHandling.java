/* 
public class ExceptionHandling
{
    public static void main(String x[])
    {
       try
       {
         int arr[]=new int[2];
         arr[0]=100;
         arr[1]=200;
         System.out.println(arr[2]);
       }
      
       catch(ArrayIndexOutOfBoundsException ex)
       {
        System.out.println(ex.getMessage());
       }
    }
}
 

   //! throws keyword
   class ABC 
   {
       void calc() throws Exception
       {
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(c);
       }
   }
   public class ExceptionHandling
   {
       public static void main(String x[])
       {
           ABC obj=new ABC();

           try
           {
             obj.calc();
           }
           catch(Exception ex)
           {
            System.out.println(ex.getMessage());
           }
       }
          
   }

   

     //! Throw keyword

  class userDefindException extends ArithmeticException  //!It is must to give specified type of exception name
  { 
     public String getErrorMessage()
     {
      return "Yesssssssss";
     }
  }
 
  class ABC
  {
      void Obeserve(int a)
      {
          if(a<18)
          {
            userDefindException v = new userDefindException();
            throw v;
          }
          else
          {
            System.out.println("You are valid voter");
          }
         
      }

  }
  public class ExceptionHandling
  {
    public static void main(String arg[])
    {
        
        try
        {
          ABC obj=new ABC();
          obj.Obeserve(10);
        }
        catch(userDefindException ex)
        {
          System.out.println(ex.getErrorMessage());
        }
    }
  }

   

//! Try with resourse bundle

import java.util.*;
public class ExceptionHandling
{
   public static void main(String x[])
   {

      try(Scanner xyz  = new Scanner(System.in))//!Passed object as parameter
      {
        System.out.println("Enter the two values");
        int a=xyz.nextInt();
        int b=xyz.nextInt();
        int c=a/b;
        System.out.println("Division is "+c);
      }
      catch(Exception ex)
      { System.out.println("Error is "+ex);
      } 
   }
}



 //! Catch with more than one exception class

 
import java.util.*;
public class ExceptionHandling
{
   public static void main(String x[])
   {
      try(Scanner xyz  = new Scanner(System.in))
      {
        System.out.println("Enter the two values");
        int a=xyz.nextInt();
        int b=xyz.nextInt();
        int c=a/b;
        System.out.println("Division is "+c);
      }
      catch(ArithmeticException | InputMismatchException ex)
      { System.out.println("Error is "+ex);
      } 
	 
   }
}



//! Throwable class

// Constructor one -> Throwable t=new Throwable();

import java.util.*;
public class ExceptionHandling
{
  public static void main(String arg[])
  {
    try(Scanner xyz=new Scanner(System.in))
    {
      int a=xyz.nextInt();
      int b=xyz.nextInt();
      if(b==0)
      {
        Throwable t=new Throwable();
        throw t;
      }
      else
      {
        int c=a/b;
        System.out.println("Dicision is "+c);
      }
      
    }
    catch(Throwable ex)
      {
        System.out.println("Error is "+ex);
      }
  }
}

// Constructor Two -> Throwable t=new Throwable("Try to avoid to give second value is zero");

import java.util.*;
public class ExceptionHandling
{
  public static void main(String arg[])
  {
    try(Scanner xyz=new Scanner(System.in))
    {
      int a=xyz.nextInt();
      int b=xyz.nextInt();
      if(b==0)
      {
        Throwable t=new Throwable("Avoid second value as zero!");
        throw t;
      }
      else
      {
        int c=a/b;
        System.out.println("Dicision is "+c);
      }
      
    }
    catch(Throwable ex)
      {
        System.out.println("Error is "+ex);
      }
  }
}


*/


// Constructor Two -> Throwable t=new Throwable(String,Throwable);

import java.util.*;
public class ExceptionHandling
{
  public static void main(String arg[])
  {
    try(Scanner xyz=new Scanner(System.in))
    {
      int a=xyz.nextInt();
      int b=xyz.nextInt();
      if(b==0)
      {
        ArithmeticException ex = new ArithmeticException();
        Throwable t=new Throwable("Avoid second value as zero!",ex);
        throw t;
      }
      else
      {
        int c=a/b;
        System.out.println("Dicision is "+c);
      }
      
    }
    catch(Throwable ex)
      {
        System.out.println("Error resion is"+ex.getCause());
        System.out.println("Avoid Exception message"+ex.getMessage());
      }
  }
}
/*
 Defination-:An unexcepted/unwanted event that disturbs the  normal flow of the program called as Exception.

 ex-:1)If I want to read data from file and that file is not present thaen file not found exception is occured this is an example of exception handaling.
2)Tired Punchar Exception
3)Sleeping Exception.

It is recommended that you should handle exception.

Purpose Of Exception Handling-:
                        Graceful(Do not miss any thing.) termination of the program.

Meaning Exception Handaling-:
                        Exception handaling is doesnt mean repairing an exception we have provide alternative way to continue rest of the program normally is the concept of exception handaling 
                    
        ex. Our programming requiremnet is to read data from remote file locating at london at run time if london file is not available our program should not be terminated abnormally we have to provide some local file to continue rest of the program normally this way of defining alternative is nothing but exception handaling.

        try
        {
          read the data from remote file located in london
        }
        catch(FileNotFoundException e)
        {
          use local file & continue rest of the program normally.
        }


*)Run Time Stack Mechanism-:

 For Every thred JVM will create one run time Stack.Each and every method call perform by that thread will be stored in correspoinding stack.Each entry in the stack is called stack frame or activation record after compliting evry method call the corresponding entry from the stack will removed after compling all method calls the stack will become empty and that empty stack will be distroid by JVM just before terminating the thred.

 class Test
 {
   p s v main(String arg[]) // JVM main thread calls main method by default
   {
     dostuf(); // main method call dostuff
     
     After compliting the method will terminated from stack by default.
   }
   p s v dostuff()
   {
      domorestuff()//dostuff calls domorestuff

      / Can not find any next line for execution hence control go back to main method and terminated from stack by default
   }   
   }
   p s v domorestuff()
   {
     sop("Hello");//After compling domorestuff normally the contol goes to dostuff and terminated from stack by default
   }   
 }


 At last when the stack is empty the stack is removed by JVM.

 In above prgram the normal flow of program is maitain.
 
 
*)Default exception handaling in java-:

  1)Inside a method if any exception occure the method in which it is rised  is responsible to create exception object by including following information:1)Name of exception 2) Description of exception 3)Location at which exception occures(Stack strace)
  2)after creating exception object method hand over that object to jvm
  3)JVM will check whether the method contains any exception handaling code or not if the method does not contaion exception handaling code then jvm terminate that method abnormally and remove corresponding entry from stack.
  4)JVM Idetifies caller method and checks wherether caller method contanin any handaling code or not 
  5)If the caller methid does not contain then JVM terminate that caller method also abnormally and remove corresponding entry from the stack
  6)This process wii continue until main method and if the main method also does not contain handaling code then jvm terminated main method abnorally and remove corresponding entry from stack .
  7)JVM calls The main method hence It is the responsibility of JVM to handle the exception.
  8)JVM hand over the exception object to "default exception handler" which is the part of JVM.
  9)Default exception handler exception informataion in the following format and terminate program abnormally:

    exception in thred xx:Name of exception:description
                           Stack Trace

class Test
{
   p s v main(String arg[]) //First method call by main thread by default.
   {
     dostuff() //calls dostuff

     if main method also not having any exception handling code then JVM terminate main method also Now main method is called by JVM hence its reponsibility of JVM to handle exception.JVM calles default exception handler to handel exception.
   }
    p s v dostuff()
    {
      domorestuff()//calls domorestuff

      If current method does not having any exception handling code then JVM terminate current method and goes to caller method 
    }
    p s v domorestuff() //exception rise curent method is resposible to craete exception object , JVM come in to picture and check if current method have any exception handler code or not , if not then it terminate the current method from stack and goes to caller method in this case caller method having responsibility to handle exception.
    {
      sop(10/0);//Arithamatic exception
    }
}

Program termination is abnormal.

class Test
{
  p s v main(String arg[])
 {
   dostuff();
 }
  p s v dostuff()
  {
    domorestuff();
    sop(10/0);
  }
  p s v domorestuff()
  {
    sop("Hello");
  }
}

Output->
          Hello
          Exeption at main thred:
          at dostuff()
          at main()



class Test
{
  p s v main(String arg[])
 {
   dostuff();
   sop(10/0);
 }
  p s v dostuff()
  {
    domorestuff();
    sop("hii");
  }
  p s v domorestuff()
  {
    sop("Hello");
  }
}

output->
Hello
hii
exception at main thread:java.lang.ArithamaticException/by zero
at main()
(2 method are excecuted normally while one got exception).


Note-:
1)If all methods are terminate normally then only program termination is normal.
2)If one method is terminate abnormally then program termination is abnormal.


*)This is not recommended to rely on default exception handaling because our application terminate abnormally hence to handel exception we should use customize exception tech.

*)Exception Hierarchy-:

                             Throwable(it is class)
                
                Exception                                   Error

1)Throwable class acts as root for java exception hierarchy
2)Throwable define two child classes:
   1) Exception
   2)Error

Q)Difference between error and exception

*)Exception-:Most of the time exception are caused by our program and this are recoverable.
ex-if our programming requirement is to read data from file locating at london at run time if remote file is not available then we will get run time exception saying file not found exception.If file not found exception occure we can provide loacal file and contine rest of the program normally.(recoverbale means we can recove current exception.)

try
{
 read data from file remotly which is loacting at london 
}
catch(Exception e)
{
  use local file and continue rest of progarm normally.
}

*)Error-:
1)Most of the time error are not cause by our program but this are cause by system resources
2)Error are non recoverable.
ex-If out memory error occures being programmer we cant do anything and program will be terminate abnormmal.
System admin or server admin is responsile to increse heap memory.


*)Exception child class:

1)RuntimeExcdeption
2)IoException
3)servlateException
4)RemoteException
5)InterputedException
...

1)Child of RuntimeExcdeption
 1)ArithamaticException
 2)NullPointerException
 3)classcatchecdexception
 4)IndexOutOfException
       1)ArrayIndexoutOfBoundException
       2)StringIoOutOfBoundException
5)illegalArgumentExecption
    1)numberformat exception


*)IoException
1)EOFException
2)FileNotFoundException
3)InterptedIoException


*)Error
1)VMError
    1)StackOverflowerror
2)outOfMemoryError
3)Accertionerror
4)exceptionInInitializerError


Q)Differenece between checked exception and unchecked exception
Q)Difference between final,finalize,finally.


Note :
    where it is checked exception or unchecked exception complasary it occure at progarm run time there is no any chance to occure exception at compile time.

*)Checked Exception-:
            
                 



























 */

 import java.io.*;
 public class ExceptionNotes
 {
    public static void main(String arg[])
    {
        PrintWriter pw = new PrintWriter("asc.txt");
        pw.println("Hello");
    }
 }
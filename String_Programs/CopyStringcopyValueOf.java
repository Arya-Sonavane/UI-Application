

import java.util.*;

public class CopyStringcopyValueOf
{
    public static void main(String arg[])
    {
        String str="Vaibhav Shete";
        char arr[]=str.toCharArray();
        
        for(int i=0;i<arr.length;i++)
        {
           System.out.println(arr[i]);
        }

        //Create constructor of string class

        String ctr=new String();

        String Name=ctr.copyValueOf(arr);

        System.out.println(Name);
 
    }
}

//! Copy String using copyValueOf(char Arr[])--> need to create String constructor before.
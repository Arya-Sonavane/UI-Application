
/* 

//! Count the character in words.



public class Practice
{
    public static void main(String x[])
    { 
        String str="This is a java language";

        int count=0;
        char currentChar;
        for(int i=0;i<str.length();i++)
        {
            currentChar=str.charAt(i);
            
            if (currentChar != ' ') {
                count++;
            } else {
                // If we encounter a space, print the length of the word and reset
                if (count > 0) {
                    System.out.println(count);
                    count= 0;
                }
            }
        }
        if (count> 0) {
            System.out.println(count);
        }
    }

}




//! Inserting one string in another

public class Practice
{
    public static void main(String x[])
    { 
        String str="GeeksGeeks";
        String btr="For";

        //Output->GeeksForGeeks
        //index=4

        char arr[]=str.toCharArray();
        char brr[]=btr.toCharArray();

        int i=0;

        int index=6;
        int EndIndex=index+brr.length;
        char crr[]=new char[arr.length+brr.length];

        int a=0;
        for(i=0;i<crr.length;i++)
        {
           if(i>index && i<=EndIndex)
           {
             continue;
           }
           else
           {
              crr[i]=arr[a];
              a++;
           }
        }

        //Inserting values
       int z=0;
       for(i=index+1;i<=EndIndex;i++)
       {
            crr[i]=brr[z];
            z++;
       }
       
       System.out.println("!!!!!!!!!!!!!!!!!!");

       for(i=0;i<crr.length;i++)
       {
        System.out.println(crr[i]);
       }
       
    }

}



//! java String program to delete leading zeros

public class Practice
{
    public static void main(String x[])
    { 
        String str="00000123569";

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                count++;
            }
        }
        System.out.println(count);

    }

}



//! use split function to count total number of words and count of characters each word have

public class Practice
{
    public static void main(String x[])
    { 
        String str="Vaibhav Shete";

        String arr[]=str.split(" ");

        //System.out.println(arr.length);

        String btr;
        for(int i=0;i<arr.length;i++)
        {
            
            btr=arr[i];
            int count=0;
            for(int j=0;j<btr.length();j++)
            {
                count++;
            }

            System.out.println(count);
        }

    }

}


*/
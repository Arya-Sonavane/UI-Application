public class ReverseOrderOfString
{
    public static void main(String arg[])
    {
        String str="Hello world Vaibhav";

        char arr[]=str.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);                 // Hello world
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");


        int startEndex=0;

        int length=arr.length;
       // System.out.println(length);

        int endIndex=arr.length-1;
        //System.out.println(endIndex);

        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==' ' || i==0)
            {
               if(i==0)
               {
                 startEndex=0;
               }
               else
               {
                 startEndex=i+1;
               }

               for(int j=startEndex;j<=endIndex;j++)
               {
                  System.out.println(arr[j]);
               }

               endIndex=i-1;
               System.out.println();
            
            }
        }
    }
}

/*
                                                   //! Algorithm

                                                   H e l l o   W o r l d
                                                   0 1 2 3 4 5 6 7 8 9 10

                                                   arr.length=11;
                                                   endIndex=10;
                                                   for(int i=arr.length;i>=0;i--)
                                                   {
                                                     if(arr[i]==' ' || i==0)      // if(arr[5]==' ')//!True
                                                     {
                                                        if(i==0)
                                                        {
                                                          StartEndex=0;
                                                        }
                                                        else                          StartEndex=5+1=>6
                                                        {
                                                          StartEndex=i+1;
                                                        }
                                                        for(int j=StartEndex;j<=endIndex;j++)  //! 6;6<=10;
                                                        {
                                                          System.out.println(arr[j]);
                                                        }
                                                        endIndex=i-1;                        //endIndex=5
                                                     }
                                                   }

 */
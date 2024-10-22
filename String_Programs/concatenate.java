import java.util.*;

public class concatenate
{
    public static void main(String arg[])
    {
        String str="Vaibhav Shete";

        String btr="karan kumar";

        char[] ch = str.toCharArray();
        char[] ch1 = btr.toCharArray();
        char[] ch2 = new char[ch.length+ch1.length];
        int k = 0;
        for(int i = 0;i<ch.length;i++){
            ch2[k++] = ch[i];
        }
        for(int i = 0;i<ch1.length;i++){
            ch2[k++] = ch1[i];
        
        }

        for(int i =0;i<ch2.length;i++){
            System.out.print("\t"+ch2[i]);
        }
        

        
    }
}
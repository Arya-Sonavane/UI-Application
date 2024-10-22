import java.io.*;
public class FileHandaling
{
    public static void main(String arg[]) throws IOException
    {
        
        File f=new File("C:\\Users\\hp\\Desktop\\core java practice\\IO stream File handling\\Demo\\first.txt");
        FileWriter fw=new FileWriter(f);
        String ch="Arya";
        fw.write(ch);
        fw.close();
    }
}
public class Wrapper
{
    public static void main(String arg[])
    {
       StringBuffer sb=new StringBuffer("abc");
       sb.delete(1,3);
       System.out.println(sb);
    }
}
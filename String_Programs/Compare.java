public class Compare
{
    public static void main(String arg[])
    {
        String s1="good";
        String s2="gord";
        if(s1.length()==s2.length()){
            boolean flag=false;
                for(int i=0;i<s1.length();i++)
                {
                    if(s1.charAt(i)!=s2.charAt(i))
                    {
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    System.out.println("not equals");
                }else{
                    System.out.println("yes equals");
                }
        }else{


        }  
    }
}
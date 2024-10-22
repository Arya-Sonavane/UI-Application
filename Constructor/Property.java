import java.util.*;

public class Property
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number of interior wall::");
        int interior=sobj.nextInt();

        System.out.println("Enter the number of Exterior wall::");
        int Exterior=sobj.nextInt();

        float interiorWall []=new float[interior];

        float ExteriorWall []=new float[Exterior];

        System.out.println("Enter the values in array Interior");
        for(int i=0;i<interiorWall.length;i++)
        {
            interiorWall[i]=sobj.nextFloat();
        }

        System.out.println("Enter the values in array Exterior");
        for(int i=0;i<ExteriorWall.length;i++)
        {
            ExteriorWall[i]=sobj.nextFloat();
        }

        float sum1=0;
        float sum2=0;

        for(int i=0;i<interiorWall.length;i++)
        {
            sum1=sum1+interiorWall[i];
        }

        for(int i=0;i<ExteriorWall.length;i++)
        {
            sum2=sum2+ExteriorWall[i];
        }

        System.out.println(sum1);
        System.out.println(sum2);
        float result=sum1*18+sum2*12;
        System.out.println(result);

    }
}
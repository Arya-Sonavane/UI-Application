class Cube
{
    int no;
    Cube(int no)
    {
        this.no=no;
    }
    int getCube()
    {
        return no*no*no;
    }
}
public class CubeApp
{
    public static void main(String arg[])
    {
        Cube c=new Cube(5);
        int result=c.getCube();
        System.out.printf("Cube is %d\n",result);
    }
}
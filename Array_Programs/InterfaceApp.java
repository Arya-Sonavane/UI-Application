
/* 
interface ABC
{
    float PI=3.14f;//public static final 
    void show();//public abstract
}
class MNO implements ABC
{
    public void show()
    {
        System.out.println("Vaibhav");
    }
}

public class InterfaceApp
{
    public static void main(String arg[])
    {
        MNO obj=new MNO();
        obj.show();
    }
}


interface Area
{
    void setRadius(float radius);
    float getResult();
}

class Circle implements Area
{
    float m;
    public void setRadius(float radius)
    {
        m=radius;
    }
    public float getResult()
    {
        return m*m*3.14f;
    }
}
class Cirm implements Area
{
    float m;
    public void setRadius(float radius)
    {
        m=radius;
    }
    public float getResult()
    {
        return m*2*3.14f;
    }
}

public class InterfaceApp
{
    public static void main(String arg[])
    {
        Area obj=new Circle();
        obj.setRadius(5.5f);
        float ans=obj.getResult();

        System.out.println(ans);

        obj=new Cirm();
        obj.setRadius(5.5f);
        float ans1=obj1.getResult();

        System.out.println(ans1);
    }
}
  



    interface ABC
    {
        protected void show();  //not allowed also final and static also not allowed

    }
    class MNO implements ABC
    {
        public void show()
        {
           System.out.println("Yes");
        }
    }
    public class InterfaceApp
    {
        public static void main(String arg[])
        {
            MNO obj=new MNO();
            obj.show();
        }
    }



  //!Multiple Inheritance

  interface A 
  {
  int a=10;
    void show();
  }
  interface B 
  {
    int a=20
    void show();
  }
  class C 
  {
    void show()
    {
        System.out.println("C show");
    }
  }
  class D extends C implements A,B
  {
     public void show()
     {
        System.out.println("D show");
        System.out.println(a);
     }
  }

  public class InterfaceApp
  {
    public static void main(String arg[])
    {
        D obj=new D();
        obj.show();
    }
  }



    //! Abstract Class Concept
    abstract class ABC
    {
        protected abstract void show();

    }
    class MNO extends ABC
    {
        public void show()
        {
            System.out.println("Yes");
        }
    }
    public class InterfaceApp
    {
      public static void main(String arg[])
      {
          MNO obj=new MNO();
          obj.show();
      }
    }
*/


class ABC{
    void show()
    {

    }
}
class MNO 
{
    void show()
    {

    }
}
class FBC extends ABC,MNO
{
    
}
public class InterfaceApp
{
   public static void main(String arg[])
   {
    FBC obj=new FBC();
    obj.show();
  }

}
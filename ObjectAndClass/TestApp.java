import java.util.*;
class Area{

	float rad,result;// instance varibale
	
	void setRadius(float radius)
	{
		rad = radius;//
	}
	float getRadius(){
		System.out.println("Hello"+rad);//hello 5
		result = (rad*rad)*3.14f;		
		return result;//78.5
	}
}
public class TestApp{
	public static void main(String []s)
	{
	
		 	Scanner sc  = new Scanner(System.in);
			System.out.println("Enter Radius:");
			float r = sc.nextFloat();//5

			Area ref = new Area();
			ref.setRadius(r);
			float rr = ref.getRadius();
			System.out.println("Area is :"+rr);
	}
}
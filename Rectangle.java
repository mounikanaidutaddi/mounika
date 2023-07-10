class Rectangle{
	public static void main(String[] args){
		Rect r1=new Rect();
		r1.length=4;
		r1.breadth=8;
		System.out.println(r1.area());
		System.out.println(r1.circumference());
		}
}

class Rect{
		int length;
		int breadth;

public int area()
{
return length*breadth;
}
public int circumference()
{
return 2*(length+breadth);
}
}


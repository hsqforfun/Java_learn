package helloworld;
 
 /** 
  * <pre>
  * System.out.println(new Date());
  * </pre>
  * @author www...
  * @author hsq
  * @version 1.0.0
  */

public class helloworld {
	public static void main(String[] args) {
		Print_test test1 = new Print_test();
		System.out.println("Hello altman's world!");
		System.out.println("Done!");
		test1.biu();
		circle s1 = new circle();
		doStuff(s1);
		s1.setArea(20);
		doStuff(s1);
		byte b = 16;
		b >>>= 2;
		System.out.println(b);
	}
	
	public static void doStuff(shape s) {
		s.draw();
	}
}

class Print_test {
//	Constructor
	Print_test() {
		System.out.println("Constructor!");
	}
	public void biu() {
		System.out.println("Biu Biu Biu!");
	}
}

class shape {
	private int  area = 10;
	
	public void draw() {
		System.out.println("Shape draw!");
		System.out.printf("Area is %d !\n", area);
	}
	
	public void setArea( int newArea ) {
		area = newArea;
	}
}

class circle extends shape {
	public void draw() {
		System.out.println("Circle draw!");
	}
}
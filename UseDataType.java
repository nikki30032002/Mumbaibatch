package javatote;

public class UseDataType {
   
	public void AreaofRectangle() {
		
		int length = 50;
		int breadth = 20;
		int area = 0;
		
		area = length * breadth;
		System.out.println("area = "+area);
	}
	
public void AreaofTriangle() {
		
		float b = 3;
		float h = 19;
		float area1 = 0;
		
		area1 =  (b * h)/2;
		System.out.println("area of Triangle = "+area1);
	}

	
	public static void main(String[] args) {
		UseDataType a = new UseDataType();
		a.AreaofRectangle();
		a.AreaofTriangle();
	}
}

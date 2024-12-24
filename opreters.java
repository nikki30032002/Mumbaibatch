package javatote;

public class opreters {




	int a = 7;
	int b = 2;
	int c;
	
	public int addNum() {
		 c = a + b;
		return c;
	}
	
	public int multiplyNum() {
		c = a * b;
		return c;
	}
	public int subtrctNum(){
		c = a - b;
		return c;
	}
	public int diviedNum() {
		c = a/b;
		return c;
	}
	public int moduleNum() {
		c = a%b;
		return c;
	}

	public static void main(String[] args) {
		opreters m = new opreters();
		m.addNum();
		
		int addition = m.addNum();
		int multiplProd = m.multiplyNum();
		int subtrctno = m.subtrctNum();
		int divions= m.diviedNum();
		int modulation = m.moduleNum();
		System.out.println("addition="+addition);
		System.out.println("multiplProd="+multiplProd);
		System.out.println("subtrctno=" +subtrctno);
		System.out.println("divions=" +divions);
		System.out.println("modulation=" +modulation);
		
		

	}

}	

	


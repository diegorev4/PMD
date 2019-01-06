
public class GestionA {
	
	private int a;
	private int b;
	
	public GestionA(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int suma() {
		int c = a + b;
		return c;
	}
	
	public void aleatorios() {
		a = (int) (Math.PI * a);
		b = (int) (Math.random()*10);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
}

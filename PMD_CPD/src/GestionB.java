
public class GestionB {

	private int a;
	private int b;
	
	public GestionB(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int resta() {
		int c = a - b;
		return c;
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

	public void aleatorios() {
		a = (int) (Math.PI * a);
		b = (int) Math.random()*10;
	}
}

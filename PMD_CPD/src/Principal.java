
public class Principal {

	public static void main(final String[] args) {
		final GestionA gestA = new GestionA(10, 34);
		final GestionB gestB = new GestionB(37, 1);

		System.out.println("Suma A: " + gestA.suma());
		System.out.println("Resta B: " + gestB.resta());
		
		gestA.aleatorios();
		gestB.aleatorios();
		
		System.out.println("A.a: " + gestA.getA());
		System.out.println("A.b: " + gestA.getB());
		System.out.println(gestA.suma());
	}

}

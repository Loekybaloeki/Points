package Main;

public class Test {

	public static void main(String[] args) {
		Points p1 = new Points(3, 4);
		p1.translate(1, 3);
		p1.scale(0.5);
		System.out.println(p1.getX() + " " + p1.getY());

	}

}

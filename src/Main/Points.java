package Main;

public class Points {
	private double x;
	private double y;

	{

	}

	public Points(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void translate(int x2, int y2) {
		x += x2;
		y += y2;
	}

	public void scale(double z) {
		x *= z;
		y *= z;

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}

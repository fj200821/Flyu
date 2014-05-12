import java.awt.Point;

public class ABC {
	public static void main(String arg[]) {
		Point a = new Point(3, 0);
		Point b = new Point(0, 0);
		Point c = new Point(3, 4);
		System.out.println("abc=" + getABC(a, b, c));
	}

	private static double getABC(Point a, Point b, Point c) {
		double ab = Math.sqrt(Math.pow(b.y - a.y, 2) + Math.pow(b.x - b.x, 2));
		double cb = Math.sqrt(Math.pow(b.y - c.y, 2) + Math.pow(b.x - c.x, 2));
		double ac = Math.sqrt(Math.pow(c.y - a.y, 2) + Math.pow(c.x - a.x, 2));
		double cosABC = (double)((double)(ab*ab + cb*cb - ac*ac)
				/ (double)(2 * ab * cb));
		
		return Math.toDegrees(Math.acos(cosABC));

	}
}

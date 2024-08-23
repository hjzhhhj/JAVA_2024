package ddd;
import java.util.Scanner;
class Rectangle {
	int width;
	int height;
	public Rectangle() {
		width = 1;
		height = 1;
	}
	public int calculatePerimeter () {
		int c = ( width + height ) * 2;
		return c;
	}
	public int calculateArea () {
		int area = width * height;
		return area;
	}
	public int getWidth () {
		return width;
	}
	public int getHeight () {
		return height;
	}
	public void setWidth (int w) {
		if ( w > 0 && w < 20 ) {
			width = w;
		}
		else {
			System.out.print("잘못된 값을 입력하셨습니다.");
		}
	}
	public void setHeight (int h) {
		if ( h > 0 && h < 20 ) {
			height = h;
		}
		else {
			System.out.print("잘못된 값을 입력하셨습니다.");
		}
	}
}
public class gd {
	public static void main(String args[]) {
		Rectangle rec = new Rectangle();
		Scanner sc = new Scanner(System.in);
		rec.setWidth(sc.nextInt());
		rec.setHeight(sc.nextInt());
		int a = rec.calculatePerimeter();
		int b = rec.calculateArea();
		int d = rec.getWidth();
		int e = rec.getHeight();
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
	}
}

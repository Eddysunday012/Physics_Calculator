import java.util.Scanner;

public class Vectors {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the diagonal vector?"); //PLACEHOLDER: type 123.45 if n/a
		double diagonal = keyboard.nextDouble();
		System.out.println("What is the x vector component?");
		double xComponent = keyboard.nextDouble();
		System.out.println("What is the y vector component?");
		double yComponent = keyboard.nextDouble();
		System.out.println("What is the angle of the vector?"); //positive for above the horizontal, and negative for below
		double angle = keyboard.nextDouble();
		
		if (diagonal == 0) {
			xComponent = 0;
			yComponent = 0;
			angle = 0;
		}
		if (xComponent == 0) {
			if (!(yComponent == 123.45)) {
				diagonal = yComponent;
				if (yComponent > 0) {
					angle = 90;
				}
				if (yComponent < 0) {
					angle = -90;
				}
				if (yComponent == 0) {
					angle = 0;
				}
			}
			if (!(diagonal == 123.45)) {
				yComponent = diagonal;
				if (diagonal > 0) {
					angle = 90;
				}
				if (diagonal < 0) {
					angle = -90;
				}
				if (diagonal == 0) {
					angle = 0;
				}
			}
		}
		if (yComponent == 0) {
			angle = 0;
			if (!(xComponent == 123.45)) {
				diagonal = xComponent;
			}
			if (!(diagonal == 123.45)) {
				yComponent = diagonal;
			}
		}
		if (angle == 0) {
			yComponent = 0;
			if (!(xComponent == 123.45)) {
				diagonal = xComponent;
			}
			if (!(diagonal == 123.45)) {
				xComponent = diagonal;
			}
		}
		
		if ((diagonal == 123.45) && !(diagonal == 0)) {
			if (!(xComponent == 123.45) && !(yComponent == 123.45)) {
				diagonal  = Math.pow(xComponent, 2) + Math.pow(yComponent, 2);
				diagonal = Math.sqrt(diagonal);
			}
			if (!(xComponent == 123.45) && !(angle == 123.45)) {
				diagonal  = xComponent * Math.cos(angle);
			}
			if (!(yComponent == 123.45) && !(angle == 123.45)) {
				diagonal  = yComponent * Math.sin(angle);
			}
			else {
				
			}
		}
		if ((xComponent == 123.45) && !(xComponent == 0)) {
			if (!(yComponent == 123.45) && !(diagonal == 123.45)) {
				xComponent  = Math.pow(diagonal, 2) - Math.pow(yComponent, 2);
				xComponent = Math.sqrt(xComponent);
			}
			if (!(diagonal == 123.45) && !(angle == 123.45)) {
				xComponent  = diagonal * Math.cos(angle);
			}
			if (!(yComponent == 123.45) && !(angle == 123.45)) {
				xComponent  = yComponent / Math.tan(angle);
			}
			else {
				
			}
		}
		if ((yComponent == 123.45) && !(yComponent == 0)) {
			if (!(xComponent == 123.45) && !(diagonal == 123.45)) {
				yComponent  = Math.pow(diagonal, 2) - Math.pow(xComponent, 2);
				yComponent = Math.sqrt(yComponent);
			}
			if (!(diagonal == 123.45) && !(angle == 123.45)) {
				xComponent  = diagonal * Math.sin(angle);
			}
			if (!(yComponent == 123.45) && !(angle == 123.45)) {
				yComponent  = xComponent * Math.tan(angle);
			}
			else {
				
			}
		}
		if ((angle == 123.45) && (!(angle == 0) || !(angle == -90) || !(angle == 90))) {
			if (!(xComponent == 123.45) && !(yComponent == 123.45)) {
				angle  = Math.atan(yComponent/xComponent); 
				angle = Math.toDegrees(angle);
			}
			if (!(diagonal == 123.45) && !(xComponent == 123.45)) {
				angle  = Math.acos(xComponent/diagonal); 
				angle = Math.toDegrees(angle);
			}
			if (!(diagonal == 123.45) && !(yComponent == 123.45)) {
				angle  = Math.asin(yComponent/diagonal);
				angle = Math.toDegrees(angle);
			}
			else {
				
			}
		}
		else {
			
		}
		System.out.println("Diagonal Vector = " +diagonal);
		System.out.println("X Component = " +xComponent);
		System.out.println("Y Component = " +yComponent);
		System.out.println("Angle = " +angle);
	}

}

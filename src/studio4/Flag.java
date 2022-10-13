package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		StdDraw.setCanvasSize(1235, 650);
		StdDraw.setPenRadius(1);
		StdDraw.setXscale(0,1235);
		StdDraw.setYscale(0,650);
		StdDraw.setPenColor(143,100,0);
		StdDraw.filledRectangle(0.5, 0.5, 1235, 650);
		StdDraw.setPenColor(100,100,200);
		StdDraw.setPenRadius(0.05);
		StdDraw.line(0, 0, 1235, 650);
		StdDraw.line(0, 650, 1235, 0);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0, 0, 100);
		StdDraw.filledCircle(0, 650, 100);
		StdDraw.filledCircle(1235, 0, 100);
		StdDraw.filledCircle(1235, 650, 100);
		StdDraw.filledCircle(617, 325, 100);

	}
}
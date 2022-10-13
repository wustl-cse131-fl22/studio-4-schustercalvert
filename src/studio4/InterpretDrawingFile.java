package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();

		if (shape.equals("ellipse"))
		{
			if (in.nextBoolean())
			{
				double x = in.nextDouble();
				double y = in.nextDouble();
				double semiMajorAxis = in.nextDouble();
				double semiMinorAxis = in.nextDouble();
				StdDraw.setPenRadius(0.05);
				StdDraw.setPenColor(r, g, b);
				StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
			}
			else
			{
				double x = in.nextDouble();
				double y = in.nextDouble();
				double semiMajorAxis = in.nextDouble();
				double semiMinorAxis = in.nextDouble();
				StdDraw.setPenRadius(0.05);
				StdDraw.setPenColor(r, g, b);
				StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
			}
			
		}
		else if (shape.equals("rectangle"))
		{
			if (in.nextBoolean())
			{
				double x = in.nextDouble();
				double y = in.nextDouble();
				double halfwidth = in.nextDouble();
				double halfhight = in.nextDouble();
				StdDraw.setPenRadius(0.05);
				StdDraw.setPenColor(r, g, b);
				StdDraw.filledRectangle(x, y, halfwidth, halfhight);
			}
			else
			{
				double x = in.nextDouble();
				double y = in.nextDouble();
				double halfwidth = in.nextDouble();
				double halfhight = in.nextDouble();
				StdDraw.setPenRadius(0.05);
				StdDraw.setPenColor(r, g, b);
				StdDraw.rectangle(x, y, halfwidth, halfhight);
			}
		}
		else if (shape.equals("triangle"))
		{
			if (in.nextBoolean())
			{
				double x1 = in.nextDouble();
				double x2 = in.nextDouble();
				double x3 = in.nextDouble();
				double y1 = in.nextDouble();
				double y2 = in.nextDouble();
				double y3 = in.nextDouble();
				double[] x = new double[3];
				double[] y = new double[3];
				x[0] = x1;
				x[1] = x2;
				x[2] = x3;
				
				y[0] = y1;
				y[1] = y2;
				y[2] = y3;
				StdDraw.setPenRadius(0.05);
				StdDraw.setPenColor(r, g, b);
				StdDraw.filledPolygon(x,y);
			}
			else
			{
				double x1 = in.nextDouble();
				double x2 = in.nextDouble();
				double x3 = in.nextDouble();
				double y1 = in.nextDouble();
				double y2 = in.nextDouble();
				double y3 = in.nextDouble();
				double[] x = new double[3];
				double[] y = new double[3];
				x[0] = x1;
				x[1] = x2;
				x[2] = x3;
				
				y[0] = y1;
				y[1] = y2;
				y[2] = y3;
				StdDraw.setPenRadius(0.05);
				StdDraw.setPenColor(r, g, b);
				StdDraw.polygon(x, y);
			}
			
		}
		
	}
}

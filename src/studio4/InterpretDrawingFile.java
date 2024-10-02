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
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		StdDraw.setPenColor(red, green, blue);


		if (shape.equals ("rectangle")) { //can't use == for string, have to methods it eg .equals
			double X = in.nextDouble();
			double Y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			StdDraw.rectangle(X, Y, halfWidth, halfHeight);

		}

		if (shape.equals ("triangle")) {
			double [] x = new double [3];
			double [] y = new double [3];		
			x[0] = in.nextDouble();
			y[0] = in.nextDouble();
			x[1] = in.nextDouble();
			y[1] = in.nextDouble();
			x[2] = in.nextDouble();
			y[2] = in.nextDouble();
			if (!filled) {
				StdDraw.polygon(x, y);
			}
			else {
				StdDraw.filledPolygon(x, y);
			}
		}




	}
}

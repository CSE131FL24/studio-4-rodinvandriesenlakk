package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color pink2 = new Color(239, 142, 154);
		StdDraw.setPenColor(pink2);
		StdDraw.filledRectangle(11, 8, 11, 8);
		
		Color hair = new Color(245, 124, 0);
		StdDraw.setPenColor(hair);
		StdDraw.filledEllipse(0.5, 0.54, 0.229, 0.23);
		StdDraw.filledRectangle(.5, .3, .23, .25);

		
		Color skin = new Color(255, 224, 178);
		StdDraw.setPenColor(skin);
		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.23);
		 
		Color eye = new Color(174, 213, 129);
		StdDraw.setPenColor(eye);
		StdDraw.filledEllipse(0.42, 0.53, 0.02, 0.04);
		StdDraw.filledEllipse(0.57, 0.53, 0.02, 0.04);
		
		
		Color mouth = new Color(255, 127, 127);
		StdDraw.setPenColor(mouth);
		StdDraw.filledEllipse(0.5, 0.39, 0.09, 0.04);
		
		StdDraw.setPenColor(skin);
		StdDraw.filledEllipse(0.5, 0.4, 0.09, 0.04);
	;
	}
}
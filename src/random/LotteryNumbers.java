package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {

		Random r = new Random();

		int hi = r.nextInt(50);

		int hy = r.nextInt(50);

		int yy = r.nextInt(50);

		int gy = r.nextInt(50);

		int gg = r.nextInt(50);

		// System.out.println(hi);

		JOptionPane.showMessageDialog(null, "" + hi + " " + hy + " " + yy + " " + " " + gy + " " + gg);

	}

}

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(5);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		Random r = new Random();

		int hi = r.nextInt(7);

		System.out.println(hi);

		if (hi == 0) {
			JOptionPane.showMessageDialog(null, "hi");
		} else if (hi == 1) {
			JOptionPane.showMessageDialog(null, "yelo");
		} else if (hi == 2) {
			JOptionPane.showMessageDialog(null, "hello");
		} else if (hi == 3) {
			JOptionPane.showMessageDialog(null, "hola ");
		} else if (hi == 4) {
			JOptionPane.showMessageDialog(null, "salut");
		} else if (hi == 5) {
			JOptionPane.showMessageDialog(null, "yolo");
		} else if (hi == 6) {
			JOptionPane.showMessageDialog(null, "stop");
		}

		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}

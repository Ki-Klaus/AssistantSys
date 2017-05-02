package com.assistantsys.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.text.Position;

public class RobotUtil {

	private Robot mRobot;
	private StringBuffer mStrBuf;

	// private String[] mAlpha = new String[] { "a", "b", "c", "d", "e", "f",
	// "g",
	// "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
	// "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "D", "F", "G",
	// "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
	// "U", "V", "W", "X", "Y", "Z" };

	private char[] mAlpha = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
			'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X', 'Y', 'Z' };

	public void robotUtil() throws AWTException {
		mRobot = new Robot();
	}

	public String robotOperation(String s) {
		for (int i = 0; i <= s.length(); i++) {
			for (int j = 0; j <= mAlpha.length; j++) {
				if ((s.charAt(i)) == (mAlpha[j])) {
					robotCase(j);
				}
			}

		}
		return s;
	}

	private StringBuffer robotCase(int position) {
		switch (position) {
		case 0:
			mRobot.keyPress(KeyEvent.VK_A);
			mRobot.keyRelease(KeyEvent.VK_A);
			break;
		case 1:
			mRobot.keyPress(KeyEvent.VK_B);
			mRobot.keyRelease(KeyEvent.VK_B);
			break;
		}
		return null;
	}
}

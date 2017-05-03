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
	
	public void pressA(){
		mRobot.keyPress(KeyEvent.VK_A);
		mRobot.keyRelease(KeyEvent.VK_A);
	}
	
	public void pressB(){
		mRobot.keyPress(KeyEvent.VK_B);
		mRobot.keyRelease(KeyEvent.VK_B);
	}
	
	public void pressC(){
		mRobot.keyPress(KeyEvent.VK_C);
		mRobot.keyRelease(KeyEvent.VK_C);
	}
	
	public void pressD(){
		mRobot.keyPress(KeyEvent.VK_D);
		mRobot.keyRelease(KeyEvent.VK_D);
	}
	
	public void pressE(){
		mRobot.keyPress(KeyEvent.VK_E);
		mRobot.keyRelease(KeyEvent.VK_E);
	}
	
	public void pressF(){
		mRobot.keyPress(KeyEvent.VK_F);
		mRobot.keyRelease(KeyEvent.VK_F);
	}
	
	public void pressG(){
		mRobot.keyPress(KeyEvent.VK_G);
		mRobot.keyRelease(KeyEvent.VK_G);
	}
	
	public void pressH(){
		mRobot.keyPress(KeyEvent.VK_H);
		mRobot.keyRelease(KeyEvent.VK_H);
	}
	
	public void pressI(){
		mRobot.keyPress(KeyEvent.VK_I);
		mRobot.keyRelease(KeyEvent.VK_I);
	}

	public void pressJ(){
		mRobot.keyPress(KeyEvent.VK_J);
		mRobot.keyRelease(KeyEvent.VK_J);
	}
	
	public void pressK(){
		mRobot.keyPress(KeyEvent.VK_K);
		mRobot.keyRelease(KeyEvent.VK_K);
	}
	
	public void pressL(){
		mRobot.keyPress(KeyEvent.VK_L);
		mRobot.keyRelease(KeyEvent.VK_L);
	}
	
	public void pressM(){
		mRobot.keyPress(KeyEvent.VK_M);
		mRobot.keyRelease(KeyEvent.VK_M);
	}
	
	public void pressN(){
		mRobot.keyPress(KeyEvent.VK_N);
		mRobot.keyRelease(KeyEvent.VK_N);
	}
	
	public void pressO(){
		mRobot.keyPress(KeyEvent.VK_O);
		mRobot.keyRelease(KeyEvent.VK_O);
	}
	
	public void pressP(){
		mRobot.keyPress(KeyEvent.VK_P);
		mRobot.keyRelease(KeyEvent.VK_P);
	}
	
	public void pressQ(){
		mRobot.keyPress(KeyEvent.VK_Q);
		mRobot.keyRelease(KeyEvent.VK_Q);
	}
	
	public void pressR(){
		mRobot.keyPress(KeyEvent.VK_R);
		mRobot.keyRelease(KeyEvent.VK_R);
	}
	
	public void pressS(){
		mRobot.keyPress(KeyEvent.VK_S);
		mRobot.keyRelease(KeyEvent.VK_S);
	}
	
	public void pressT(){
		mRobot.keyPress(KeyEvent.VK_T);
		mRobot.keyRelease(KeyEvent.VK_T);
	}
	
	public void pressU(){
		mRobot.keyPress(KeyEvent.VK_U);
		mRobot.keyRelease(KeyEvent.VK_U);
	}
	
	public void pressV(){
		mRobot.keyPress(KeyEvent.VK_V);
		mRobot.keyRelease(KeyEvent.VK_V);
	}
	
	public void pressW(){
		mRobot.keyPress(KeyEvent.VK_W);
		mRobot.keyRelease(KeyEvent.VK_W);
	}
	
	public void pressX(){
		mRobot.keyPress(KeyEvent.VK_X);
		mRobot.keyRelease(KeyEvent.VK_X);
	}
	
	public void pressY(){
		mRobot.keyPress(KeyEvent.VK_Y);
		mRobot.keyRelease(KeyEvent.VK_Y);
	}
	
	public void pressZ(){
		mRobot.keyPress(KeyEvent.VK_Z);
		mRobot.keyRelease(KeyEvent.VK_Z);
	}
	
	private StringBuffer robotCase(int position) {
		switch (position) {
		case 0:
			pressA();
			break;
		case 1:
			pressB();
			break;
		case 2:
			pressC();
			break;
		case 3:
			pressD();
			break;
		case 4:
			pressD();
			break;
		case 5:
			pressE();
			break;
		}
		return null;
	}
}

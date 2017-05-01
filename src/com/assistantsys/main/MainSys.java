package com.assistantsys.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import com.google.gson.Gson;
import com.iflytek.cloud.speech.RecognizerListener;
import com.iflytek.cloud.speech.RecognizerResult;
import com.iflytek.cloud.speech.SpeechConstant;
import com.iflytek.cloud.speech.SpeechError;
import com.iflytek.cloud.speech.SpeechRecognizer;
import com.iflytek.cloud.speech.SpeechUtility;

public class MainSys {

	private Gson gson = new Gson();
	public static final String appid = "appid=58fe1a81";

	public static void main(String[] args) throws AWTException {
		final Robot robot = new Robot();
		SpeechUtility.createUtility(appid);

		// final JFrame mJFrame = new JFrame();
		// mJFrame.setUndecorated(true);
		// mJFrame.setSize(400, 300);
		// mJFrame.setLocationRelativeTo(null);
		// mJFrame.setVisible(true);
	}

	private static void initParam() {
		SpeechRecognizer mIat = SpeechRecognizer.createRecognizer();
		mIat.setParameter(SpeechConstant.LANGUAGE, "en_us");
		mIat.startListening(mRecognizerListener);
	}

	private static RecognizerListener mRecognizerListener = new RecognizerListener() {

		@Override
		public void onVolumeChanged(int arg0) {

		}

		@Override
		public void onResult(RecognizerResult result, boolean arg1) {
			String tempString = result.getResultString();
			System.out.println(tempString);
		}

		@Override
		public void onEvent(int arg0, int arg1, int arg2, String arg3) {

		}

		@Override
		public void onError(SpeechError arg0) {
			arg0.getErrorDescription(true);
		}

		@Override
		public void onEndOfSpeech() {

		}

		@Override
		public void onBeginOfSpeech() {

		}
	};
}

package com.assistantsys.main;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.assistantsys.model.IFlyJsonModel;
import com.assistantsys.model.Ws;
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
	private IFlyJsonModel mIFlyJsonModel;
	private RobotUtil mRobotUtil;
	private StringBuffer mStringBuffer = new StringBuffer();

	public MainSys() {
		SpeechUtility.createUtility(appid);
		initParam();
	}

	public static void main(String[] args) throws AWTException {
		JFrame mJFrame = new JFrame();
		JLabel mJLabel = new JLabel();
		mJFrame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		mJFrame.getContentPane().setBackground(Color.black);
		mJLabel.setText("11111");
		mJLabel.setForeground(Color.white);
		mJFrame.setUndecorated(true);
		mJFrame.setSize(400, 300);
		mJFrame.setLocationRelativeTo(null);
		mJFrame.add(mJLabel);
		mJFrame.setVisible(true);
	}

	private void initParam() {
		SpeechRecognizer mIat = SpeechRecognizer.createRecognizer();
		mIat.setParameter(SpeechConstant.LANGUAGE, "en_us");
		mIat.startListening(mRecognizerListener);
		mRobotUtil = new RobotUtil();
	}

	private RecognizerListener mRecognizerListener = new RecognizerListener() {

		@Override
		public void onVolumeChanged(int arg0) {

		}

		@Override
		public void onResult(RecognizerResult result, boolean arg1) {
			String tempString = result.getResultString();
			mIFlyJsonModel = gson.fromJson(tempString, IFlyJsonModel.class);
			mStringBuffer.delete(0, mStringBuffer.length());
			for (Ws mWs : mIFlyJsonModel.getWs()) {
				mStringBuffer.append(mWs + " ");
			}
			String resultString = mStringBuffer.toString();
			mRobotUtil.robotOperation(resultString);
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

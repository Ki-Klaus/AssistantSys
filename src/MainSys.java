import javax.swing.JFrame;

import com.iflytek.cloud.speech.RecognizerListener;
import com.iflytek.cloud.speech.RecognizerResult;
import com.iflytek.cloud.speech.SpeechConstant;
import com.iflytek.cloud.speech.SpeechError;
import com.iflytek.cloud.speech.SpeechRecognizer;
import com.iflytek.cloud.speech.SpeechUtility;

public class MainSys {

	public static final String appid = "58fe1a81";

	public static void main(String[] args) {
		initIFly();
		initParam();
	}

	private static void initIFly() {
		SpeechUtility.createUtility(appid);
	}

	private static void initParam() {
		SpeechRecognizer mIat = SpeechRecognizer.createRecognizer();
		mIat.setParameter(SpeechConstant.LANGUAGE, "en_us");
		mIat.startListening(mRecognizerListener);
	}

	private static RecognizerListener mRecognizerListener = new RecognizerListener() {

		@Override
		public void onVolumeChanged(int arg0) {
			// TODO 自动生成的方法存根

		}

		@Override
		public void onResult(RecognizerResult arg0, boolean arg1) {
			// TODO 自动生成的方法存根

		}

		@Override
		public void onEvent(int arg0, int arg1, int arg2, String arg3) {
			// TODO 自动生成的方法存根

		}

		@Override
		public void onError(SpeechError arg0) {
			arg0.getErrorDescription(true);
		}

		@Override
		public void onEndOfSpeech() {
			// TODO 自动生成的方法存根

		}

		@Override
		public void onBeginOfSpeech() {
			// TODO 自动生成的方法存根

		}
	};
}

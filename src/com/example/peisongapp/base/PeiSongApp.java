package com.example.peisongapp.base;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.ClipboardManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.peisongapp.R;
import com.example.peisongapp.utils.UtilsLog;
import com.example.peisongapp.utils.UtilsVar;

public class PeiSongApp extends Application {
	
	private static ClipboardManager cm;
	private SharedPreferences screenSharedPreferences;
	private static PeiSongApp mApp;

	/**
	 * toast singleton，用来统一显示toast，这样就可以实现toast的快速刷新
	 * 
	 */

	@Override
	public void onCreate() {

		UtilsLog.log("screenHeight", "=====" + UtilsVar.screenWidth);
		super.onCreate();
		mApp = (PeiSongApp) getApplicationContext();
		toastMgr.builder.init(mApp);
		initSomeUtilsVar();
	}

	public static PeiSongApp getSelf() {
		return mApp;
	}

	public static ClipboardManager getClipboardManager() {
		if (cm == null) {
			cm = (ClipboardManager) mApp
					.getSystemService(Context.CLIPBOARD_SERVICE);
		}
		return cm;
	}

	private void initSomeUtilsVar() {

		// 获得屏幕参数
		screenSharedPreferences = this.getSharedPreferences("screen",
				MODE_PRIVATE);
		UtilsVar.screenHeight = screenSharedPreferences.getInt("screenHeight",
				0);
		UtilsVar.screenWidth = screenSharedPreferences.getInt("screenWidth", 0);
		UtilsLog.log("screenHeight", "=====" + UtilsVar.screenHeight);
		UtilsLog.log("screenHeight", "=====" + UtilsVar.screenWidth);
		// 获得本地保存城市
		UtilsLog.log("screenHeight", "=====" + UtilsVar.CITY);

	}

	public enum toastMgr {
		builder;

		private View v;
		private TextView tv;
		private Toast toast;

		private void init(Context c) {
			// v = Toast.makeText(c, "", Toast.LENGTH_SHORT).getView();
			v = LayoutInflater.from(c).inflate(R.layout.toast, null);
			tv = (TextView) v.findViewById(R.id.tv_toast);
			toast = new Toast(c);
			toast.setView(v);
		}

		public void display(CharSequence text, int duration) {
			if (text.length() != 0) {
				tv.setText(text);
				toast.setDuration(duration);
				toast.setGravity(Gravity.CENTER, 0, 0);
				toast.show();
			}
		}

		public void display(int Resid, int duration) {
			if (Resid != 0) {
				tv.setText(Resid);
				toast.setDuration(duration);
				toast.show();
			}
		}
	}
}

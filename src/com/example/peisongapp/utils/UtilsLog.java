package com.example.peisongapp.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.os.Environment;

public class UtilsLog {
	/**
	 * 是否开启日志
	 */
	public static boolean isTest = false;
	public static boolean isLog = true;
	

	public static final String HTTP_HOST_XF_COMPUTE ;

	public static void d(String key, String value) {
		if (isTest) {
			android.util.Log.d(key, value);
		}
	}

	public static void i(String key, String value) {
		if (isTest) {
			android.util.Log.i(key, value);
		}
	}

	public static void e(String key, String value) {
		if (isTest) {
			android.util.Log.e(key, value);
		}
	}

	public static void w(String key, String value) {
		if (isTest) {
			android.util.Log.w(key, value);
		}
	}

	public static void w(String key, Throwable tr) {
		if (isTest) {
			android.util.Log.w(key, tr);
		}
	}

	public static void w(String key, String value, Throwable tr) {
		if (isTest) {
			android.util.Log.w(key, value, tr);
		}
	}

	public static void log(String tag, String info) {
		StackTraceElement[] ste = new Throwable().getStackTrace();
		int i = 1;
		if (isTest) {
			StackTraceElement s = ste[i];
			android.util.Log.e(tag, String.format("======[%s][%s][%s]=====%s",
					s.getClassName(), s.getLineNumber(), s.getMethodName(),
					info));
		}
	}

	/**
	 * 
	 * @param content
	 *            保存到本地的内容
	 */
	public static void writeLog(String content) {
		if (isTest && isLog) {
//			log("write", "=====");
			int day, month;
			File localFile;
			Date date = new Date(System.currentTimeMillis());
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			content += "===="+formatter.format(date) + "====";
			Calendar calendar = Calendar.getInstance();
			day = calendar.get(Calendar.DAY_OF_MONTH);
			month = calendar.get(Calendar.MONTH);
			localFile = new File(getTxtFile(), month + "月" + day + "日" + ".txt");
			try {
//				if (localFile.exists()) {
					FileWriter fileWriter = new FileWriter(localFile, true);
					BufferedWriter bWriter = new BufferedWriter(fileWriter);
					bWriter.write(content);
					bWriter.newLine();
					bWriter.flush();
					bWriter.close();
//				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static File getTxtFile() {
		File voiceFile = new File(Environment.getExternalStorageDirectory()
				.toString() + "/" + "SouFun" + "/" + "Log" + "/");

		if (!voiceFile.exists()) {
			voiceFile.mkdirs();
		}
		return voiceFile;
	}
}

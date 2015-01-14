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
	public static boolean isLog = true;//是否保存log日志到本地目录/soufun/log
	/**
	 * 聊天接口
	 */
//	public static String url = "http://chat.client.3g.soufun.com/HttpConnection";//正式接口
	public static String url = "http://testchat.client.3g.soufun.com/HttpConnection"; //新聊天测试接口
	
//	public static String UPLOAD_URL = "http://soufunapp.3g.soufun.com/http/";//图片和音频上传的正式接口 ChatPhoto
	public static String UPLOAD_URL = "http://111.204.241.196:9082/http/";//图片和音频上传的测试接口 ChatPhoto
	
	/**
	 * 请求接口
	 */
//	public static final String HTTP_HOST = "soufunapp.3g.soufun.com/http/"; //南北方服务器	
//	public static final String HTTP_HOST_ESF = "soufunappesf.3g.soufun.com/http/"; //二手房接口
//	public static final String HTTP_HOST_ZF = "soufunappzf.3g.soufun.com/http/"; //租房接口
	
	public static final String HTTP_HOST = "111.204.241.196:9082/http/";//4.16新测试接口(外网可访问)
	public static final String HTTP_HOST_ESF = "111.204.241.196:9082/http/";//4.16新测试接口(外网可访问)
	public static final String HTTP_HOST_ZF = "111.204.241.196:9082/http/";//4.16新测试接口(外网可访问)

	/**
	 * 论坛请求接口(正式)
	 */
//    public static final String HTTP_HOST_XF = "housejk.wap.soufun.com/"; // 正式接口

	/**
	 * 论坛请求接口(测试)
	 */
	 public static final String HTTP_HOST_XF = "111.204.241.171/"; //测式接口
	 
		/**
		 *是否使用资讯测试地址
		 */
//		public static final boolean isTestNews = false;
//		public static final String HTTP_NEWS_TEST = "http://m.test.soufun.com/";  //资讯测试地址
//		public static final String HTTP_NEWS = "http://m.soufun.com/";            //资讯正式地址

	/**
	 * 论坛房贷计算器的接口
	 */
	public static final String HTTP_HOST_XF_COMPUTE = "newhousejkn.soufun.com/house/webinterface/"; // 正式接口

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

package com.example.peisongapp.base;

import android.os.Environment;

public interface PeiSongConstants {
	

	
	public static final String APP_NAME = "Android_UnMap";// 应用名称


	public static final byte NAVIGATION_TYPE_MAIN = 0;


	public static final byte NAVIGATION_TYPE_SUB = 1;


	public static final byte NAVIGATION_TYPE_OTHER = 2;

	public static final String INTENT_ACTION_EXIT_APP = "com.what.app.intent.action.EXIT_APP";
	public static final String OS_VERSION = android.os.Build.VERSION.RELEASE;
	public static final String MODEL = android.os.Build.MODEL;

	/** 支持的图�?*/
	/** 小图 */
	public static final int PIC_SIZE_SMALL = 1;
	/** 中图 */
	public static final int PIC_SIZE_MIDDLE = 2;
	/** 大图 */
	public static final int PIC_SIZE_LARGE = 3;
	/** SD卡目�?*/
	public static final String SD_PATH = Environment
			.getExternalStorageDirectory().getAbsolutePath();
	/** 根目�?*/
	public static final String ROOT_DIR_PATH = "/what/res";
	/** 缓存目录 */
	public static final String CACHE_DIR_PATH = ROOT_DIR_PATH + "/cache";
	/** 图片缓存目录 */
	public static final String PIC_CACHE_DIR_PATH = CACHE_DIR_PATH
			+ "/pic_cache";
	/** 收藏图片缓存目录 */
	public static final String STORE_PIC_CACHE_DIR_PATH = CACHE_DIR_PATH
			+ "/store_pic_cache";

	/** 列表缓存目录 */
	public static final String STORE_LIST_CACHE_DIR_PATH = CACHE_DIR_PATH
			+ "/list_cache";

	/**
	 * 闪屏页广告缓�?
	 */
	public static final String SPLASH_CACHE_AD = CACHE_DIR_PATH + "/splash_ads";

	/** 多媒体沟通，图片缓存目录 */
	public static final String MM_PIC_CACHE_DIR_PATH = CACHE_DIR_PATH
			+ "/mm_pic_cache";
	/** 多媒体沟通，大图片缓存目�?*/
	public static final String MM_PIC_LARGE_CACHE_DIR_PATH = MM_PIC_CACHE_DIR_PATH
			+ "/large";
	/** 多媒体沟通，视频缓存目录 */
	public static final String MM_VIDEO_CACHE_DIR_PATH = CACHE_DIR_PATH
			+ "/mm_video_cache";
	/** 多媒体沟通，音频缓存目录 */
	public static final String MM_VOICE_CACHE_DIR_PATH = CACHE_DIR_PATH
			+ "/mm_voice_cache";

	/** 强制升级 */
	public static final String APK_FORCE_UPDATE = "force_update";
	/** 是否能升�?*/
	public static final String APK_HAS_UPDATE = "has_update";
	/** 升级url */
	public static final String APK_UPDATE_URL = "update_url";
	/** apk大小 */
	public static final String APK_APP_SIZE = "app_size";
	/** apk描述 */
	public static final String APK_UPDATE_DESCRIBE = "update_describe";
	/** apk名称 */
	public static final String APK_APP_NAME = "app_name";
	/** apk版本 */
	public static final String APK_APP_VERSION = "app_version";
	/** 本地apk版本 */
	public static final String APK_APP_OLD_VERSION = "app_old_version";
	/** 手动更新标识 */
	public static final String APK_MANUAL_UPDATE = "manual_update";
	public static final String RECORD_NAME = "updateProgress";

	public static final String KEY_FILE_SIZE = "FileSize";
	public static final String KEY_DOWNLOADED_SIZE = "Downloaded";
	public static final String UPDATE_APK_PATH = "update_apk_path";
	public static final String APK_NAME = "apk_name";
	public static final String DOWNLOADING = "downloading";

	
	public static final String TIME_INFO = "timeinfo";
	/**
	 * 当前应用版本�?
	 */
	public static final String APP_VERSION = "appversion";
	/**
	 * 请求的message name
	 */
	public static final String MWSSAGE_NAME = "messagename";
	/**
	 * share文件用户信息�?
	 */
	public static final String USER_INFO = "userinfo";
	/**
	 * share文件用户信息�?
	 */
	public static final String ACCOUNT_INFO = "accountinfo";
	

	public static final int CODE_AUTO_UPDATE = 1001;
	public static final int CODE_FORCE_UPDATE = 1002;
	public static final int CODE_MANUAL_UPDATE = 1003;
	public static final int CODE_CITY_SWITCH_DIALOG = 1004;

	public static final String INDEX = "index";
	

	public static final int LOGIN = 101;// forResult定义的code

	public static final int PUBLISHLIST_DELETE = 102;// forResult定义的code

	public static final int CITY_SWITCH = 103;// forResult定义的code

	public static final int NEW_DETAIL = 104;// forResult定义的code

	public static final String PICS = "pics";

	public static final String TYPE = "type";

	public static final String CURRENTTYPE = "currentType";

	public static final String NUMBER = "number";
	/**
	 * 相册对象
	 */
	public static final String ALBUM = "album";

	public static final String IS_HISTORY = "ishistory";


	public final static String MESSAGE_IMG_TYPE = "imgMessage";// 图片类型
	public final static String MESSAGE_VIDEO_TYPE = "videoMessage";// 视频类型
	public final static String MESSAGE_VOICE_TYPE = "voiceMessage";// 语音类型
	public final static String MESSAGE_IMG__OPTION_FAIL = "fail";
	// 聊天状�?
	public static String OPEN = "open";
	public static String VOICE = "voice";
	public static String VIBRATE = "vibrate";
	public static String MODE = "mode";

	public static String CHAT_TIME_LAST = "chat_time_last";// 聊天�?��的时�?

	/** 缓存 **/
	public static final long FIVE_MINUTES = 5 * 60000;
	public static final long TWENTY_MINUTES = 20 * 60000;
	public static final long ONE_NEGATIVE = -1;


	public static final String[] REGEX_DETAIL_LIST = {
			"http://((?:.+?).what.com/*(?:office|shop|villa|zhuzhai|newhouse|\\d+)*)/bbs/(.{1,20}?)~(.*?)/(.*?)_(.*?).htm",
			"http://((.+?).what.com)/(.{1,20}?)~(.*?)/(.*?)_(.*?).htm",
			"http://(.*?)/(.{1,20}?)~(.*?)/(.*?)_(.*?).htm",
			"/(.{1,20}?)~(.*?)/(.*?)_(.*?).htm" };


	public final static String DEVICE_INFOMATION = "device_information";

	public final static int HOME_TO_LIST = 0;
	public final static int SEARCH_TO_LIST = HOME_TO_LIST + 1;
	public final static int RADAE_TO_LIST = SEARCH_TO_LIST + 1;

	public static final String PROMOTE_ORDER_KEY = "promote_order";
}

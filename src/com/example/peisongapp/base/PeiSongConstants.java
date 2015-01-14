package com.example.peisongapp.base;

import android.os.Environment;

public interface PeiSongConstants {
	

	
	public static final String APP_NAME = "Android_UnMap";// 应用名称

	/** activity的导航页type，一级页�?*/
	public static final byte NAVIGATION_TYPE_MAIN = 0;

	/** activity的导航页type，二级页�?*/
	public static final byte NAVIGATION_TYPE_SUB = 1;

	/** activity的导航页type，其他页�?*/
	public static final byte NAVIGATION_TYPE_OTHER = 2;

	public static final String INTENT_ACTION_EXIT_APP = "com.soufun.app.intent.action.EXIT_APP";
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
	public static final String ROOT_DIR_PATH = "/soufun/res";
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

	/**
	 * 头条
	 */
	public static final String TT = "tt";
	/**
	 * 导购
	 */
	public static final String DG = "dg";
	/**
	 * 市场
	 */
	public static final String SC = "sc";
	/**
	 * 排行�?
	 */
	public static final String PHB = "phb";
	/**
	 * 户型
	 */
	public static final String HX = "hx";
	/**
	 * 租房
	 */
	public static final String ZF = "zf";
	/**
	 * 二手�?
	 */
	public static final String ESF = "esf";
	/**
	 * 新房
	 */
	public static final String XF = "xf";
	/**
	 * 新盘
	 */
	public static final String XP = "xp";
	/**
	 * 小区 、楼盘社�?
	 */
	public static final String XQ = "xq";
	/**
	 * 写字楼商�?
	 */
	public static final String XZL_SP = "xzl_sp";
	/**
	 * 出租别墅
	 */
	public static final String ZF_BS = "zf_bs";
	/**
	 * 出租商铺
	 */
	public static final String ZF_SP = "zf_sp";
	/**
	 * 出售别墅
	 */
	public static final String ESF_BS = "esf_bs";
	/**
	 * 出售商铺
	 */
	public static final String ESF_SP = "esf_sp";
	/**
	 * 出售写字�?
	 */
	public static final String ESF_XZL = "esf_xzl";
	/**
	 * 出租写字�?
	 */
	public static final String ZF_XZL = "zf_xzl";
	/**
	 * 求租
	 */
	public static final String QZ = "qz";
	/**
	 * 求购
	 */
	public static final String QG = "qg";
	/**
	 * 合租
	 */
	public static final String HZ = "hz";

	/**
	 * 小区二手�?
	 */
	public static final String XQ_ESF = "xq_esf";
	/**
	 * 小区租房
	 */
	public static final String XQ_ZF = "xq_zf";
	/**
	 * 评估
	 */
	public static final String PG = "pg";
	/**
	 * 团购
	 */
	public static final String TG = "tg";
	/**
	 * 房源订阅
	 */
	public static final String FY_NOTIFY = "fy";
	/**
	 * 房价订阅
	 */
	public static final String FJ_NOTIFY = "fj";
	/**
	 * 收藏同步
	 */
	public static final String SC_TB = "sc_tb";
	/**
	 * 物业类型
	 */
	public static final String HOUSE_TYPE = "housetype";
	/**
	 * 视频id
	 */
	public static final String VIDEO_ID = "videoid";
	/**
	 * 视频URL
	 */
	public static final String VIDEO_URL = "videoURL";
	/**
	 * 房屋频道，其实就是类型xf，esf�?
	 */
	public static final String CHANNEL = "channel";
	/**
	 * 视频播放的时间信�?
	 */
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
	/**
	 * share文件城市资讯信息
	 */
	public static final String CITY_ZIXUN = "zixun";
	/**
	 * 每页条数
	 */
	public static final int PAGE_SIZE = 20;
	/**
	 * 收藏�?��的条�?
	 */
	public static final int STORE_NUM = 100;
	/**
	 * �?��联系�?��的条�?
	 */

	public static final int CONTACT_NUM = 50;
	/**
	 * 浏览�?��的条�?
	 */
	public static final int BROWSE_NUM = 20;
	/**
	 * 动�?�?��的条�?
	 */
	public static final int DYNAMIC_NUM = 20;

	public static final int CODE_AUTO_UPDATE = 1001;
	public static final int CODE_FORCE_UPDATE = 1002;
	public static final int CODE_MANUAL_UPDATE = 1003;
	public static final int CODE_CITY_SWITCH_DIALOG = 1004;

	public static final String INDEX = "index";
	/**
	 * 房源描述
	 */
	public static final String DESC = "desc";
	/**
	 * 交�?配套
	 */
	public static final String JTPT = "jtpt";
	/**
	 * 周边配套
	 */
	public static final String ZBPT = "zbpt";

	/**
	 * 收藏的表�?
	 */
	public static final String TABLE_STORE = "StoreHouse";
	/**
	 * 订阅房源的表�?
	 */
	public static final String TABLE_NOTIFY = "fyNotify";
	/**
	 * 筛�?
	 */
	public static final String SIFT = "sift";

	public static final String FLOW = "flow";// 本地存储流量账号�?
	/**
	 * 流量控制，自动优化开关�?0�?���?关闭
	 */
	public static final String FLOW_SELECT = "flow_select";
	/**
	 * 流量控制，优化质量项�?关闭�?�?00% �?�?0%�?�?0%
	 */
	public static final String FLOW_TYPE = "flow_type";
	/**
	 * 流量控制，最终质量项�?�?00% �?�?0%�?�?0%
	 */
	public static final String FLOW_RESULT = "flow_result";
	public static final String NOTIFICATION = "notification";// 本地存储推�?账号�?
	public static final String USERPHONE = "userphone";// 本地存储当前用户账号�?
	public static final String FREE_CHAT = "freechat";// 本地存储聊天
	public static final String AD_INFO = "ad_n_info";// 本地存储广告
	public static final String AD_TIME = "ad_time";// 本地存储广告的时�?
	public static final int BACK_REGISTER = 100;// forResult定义的code

	public static final int LOGIN = 101;// forResult定义的code

	public static final int PUBLISHLIST_DELETE = 102;// forResult定义的code

	public static final int CITY_SWITCH = 103;// forResult定义的code

	public static final int NEW_DETAIL = 104;// forResult定义的code
	/**
	 * 详情页传递的参数�?
	 */
	/**
	 * 房源id
	 */
	public static final String HOUSEID = "houseid";
	/**
	 * 房源建筑面积
	 */
	public static final String HOUSEAREA = "houseArea";
	/**
	 * 房源户型结构
	 */
	public static final String HOUSESTRUCTURE = "houseStructure";
	/**
	 * 楼盘（小区）id
	 */
	public static final String PROJCODE = "projcode";
	/**
	 * 楼盘（小区）名称
	 */
	public static final String PROJNAME = "projName";
	/**
	 * x坐标
	 */
	public static final String X = "x";
	/**
	 * y坐标
	 */
	public static final String Y = "y";
	/**
	 * 城市
	 */
	public static final String CITY = "city";
	/**
	 * 是否从小区过去的�?�?
	 */
	public static final String ISFROMXQ = "isfromxq";
	/** 区域 */
	public static final String DISTRICT = "district";
	/** 标题 */
	public static final String TITLE = "title";

	/**
	 * 列表页传参的类型键�?
	 */
	public static final String GETTYPE_KEY = "gettype";
	/**
	 * 列表页传参的类型�?
	 */
	public static final String GETTYPE_VALUE = "android";

	/**
	 * 图片浏览,号分隔图片地�?
	 */
	public static final String PICS = "pics";

	public static final String TYPE = "type";

	public static final String CURRENTTYPE = "currentType";

	public static final String NUMBER = "number";
	/**
	 * 相册对象
	 */
	public static final String ALBUM = "album";

	public static final String IS_HISTORY = "ishistory";

	/**
	 * 二手房租房传对象的名�?
	 */
	public static final String BROWSE_HOSE = "browse_house";

	/**
	 * 我的发布传对象的名称
	 */
	public static final String PUBLISH_HOSE = "publish_house";
	/**
	 * 团购：报�?
	 */
	public static final String APPLICATION = "application";
	/**
	 * 是否第一次发布信�?
	 */
	public static final String ISFIRSTPUBLISH = "isfirstpublish";
	/**
	 * 税费
	 */
	public static final String TAX = "tax_info";

	public static final String COMMONT_BREAK = "break";// 服务器断�?��接命�?
	public static final String COMMONT_CHAT = "chat";// 聊天命令
	public static final String COMMONT_SEPARAT_MESSAGE = "separate";// 显示的信息和发�?的消息不�?��
	public static final String COMMONT_IMG = "img";// 聊天发�?图片
	public static final String COMMONT_VIDEO = "video";// 视频发�?
	public static final String COMMONT_VOICE = "voice";// 语音聊天
	public static final String COMMONT_FUNCTION_SWITCHER = "checkMultimedia";// 版本控制
	public static final String COMMONT_REQVIDEO = "reqvideo";// 收到的直播看房命�?
	public static final String COMMONT_REPVIDEO = "repvideo";// 接受或�?拒绝直播看房
	public static final String COMMONT_HANDUPVIDEO = "handupvideo";// 挂断直播看房
	public static final String COMMONT_TUIJIAN = "potential";// 潜客推荐
	public static final String CHAT_QIANKE = "qianke";// 潜客的标�?

	public static final String CHAT_HANDUPVIDEO_STATIO_HOUSE_ACTION = "com.soufun.app.activity.handupvideo";// 结束直播看房
	// public static final String
	// CHAT_START_STATIO_HOUSE_ACTION="com.soufun.app.activity.startvideo";//启动直播看房
	public static final String CHAT_HOUSE_STATIO_BACK_DATA = "com.soufun.app.activity.statiobackdata";// 从直播看房返回的intentaction
	// public static final String CHAT_HOUSE_STATIO_BACK_DATA_FOR_ACTIVITY =
	// "com.soufun.app.activity.statiobackdata.chatactivity";

	public static final String CHAT_GET_OFFLINE_MESSAGES = "com.soufun.app.activity.getofflinemessage";// 免打扰模式时候的消息

	// /*
	// * 用于直播看房中传递数据的key
	// */
	// public static final String CHAT_ANY_CHAT_INFO="anyChatInfo";

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

	/** 贷款利率 */
	public static final String LOAN_INFO = "loan_info";
	public static final String LOAN_NAME = "loan_name";
	public static final String LOAN_COMMERCE_FIRST = "loan_commerce_first";
	public static final String LOAN_COMMERCE_SECOND = "loan_commerce_second";
	public static final String LOAN_COMMERCE_BIG = "loan_commerce_big";
	public static final String LOAN_COMMERCE_SMALL = "loan_commerce_small";
	public static final String LOAN_RESERVE_BIG = "loan_reserve_big";
	public static final String LOAN_RESERVE_SMALL = "loan_reserve_small";
	public static final String LOAN_STATE = "loan_state";
	public static final String LOAN_TIME = "loan_time";

	/** 评估 */
	public static final String ASSESS = "assess";
	public static final String NEWCODE = "newcode";
	public static final String INPUT_HOUSE_INFO = "input_house_info";
	public static final String MESSAGE_NAME = "messagename";
	public static final String FROM = "from";
	public static final String HOUSE_LIST = "house_list";
	/** 缓存 **/
	public static final long FIVE_MINUTES = 5 * 60000;
	public static final long TWENTY_MINUTES = 20 * 60000;
	public static final long ONE_NEGATIVE = -1;

	/** 论坛 */
	public static final String[] REGEX_DETAIL_LIST = {
			"http://((?:.+?).soufun.com/*(?:office|shop|villa|zhuzhai|newhouse|\\d+)*)/bbs/(.{1,20}?)~(.*?)/(.*?)_(.*?).htm",
			"http://((.+?).soufun.com)/(.{1,20}?)~(.*?)/(.*?)_(.*?).htm",
			"http://(.*?)/(.{1,20}?)~(.*?)/(.*?)_(.*?).htm",
			"/(.{1,20}?)~(.*?)/(.*?)_(.*?).htm" };
	/** 分享微信sdk的AppID */
	public static final String AppID = "wxc207cd5f14a013e8";
	/** 新房详情房源图片尺寸 */
	public static final int ImgSize = 600;
	/**
	 * 相册视频播放数据传�?key
	 */
	public final static String DETAIL_ALBUM_VIDEO_INFO = "videoInfo";
	/** 论坛 */

	public static final String LUNTAN_VERSON = "-5.4.1-";// 此变量为了控制GA统计每期都统�?��此改版本�?

	/**
	 * 本地存放设备信息的文件名�?
	 */
	public final static String DEVICE_INFOMATION = "device_information";

	public final static int HOME_TO_LIST = 0;
	public final static int SEARCH_TO_LIST = HOME_TO_LIST + 1;
	public final static int RADAE_TO_LIST = SEARCH_TO_LIST + 1;

	public static final String PROMOTE_ORDER_KEY = "promote_order";
}

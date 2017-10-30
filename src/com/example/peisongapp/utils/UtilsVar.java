package com.example.peisongapp.utils;

/**
 * 定义的静态变量
 * <p>
 * Title: UtilsVar
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: 
 * </p>
 * 
 * @author    
 * @date       
 */
public class UtilsVar {
	/**
	 * 流量控制，自动优化开关、0开启、1关闭
	 */
	public static int flow_select = 0;
	/**
	 * 流量控制，优化质量项，0关闭、1高100% 、2中70%、3低50%、4无图
	 */
	public static int flow_type = 0;

	/**
	 * 流量控制，最终质量项，1高100% 、2中70%、3低50%、4无图
	 */
	public static int flow_result = 1;

	// public static ArrayList<AttentionInfo> attentionInfos = new
	// ArrayList<AttentionInfo>();

	/**
	 * 定位信息
	 */
	// public static LocationInfo locationInfo = new LocationInfo(0.0, 0.0);
	/**
	 * 当前位置x坐标 经度
	 */
	public static String LOCATION_X = "0.0";
	/**
	 * 当前位置y坐标 纬度
	 */
	public static String LOCATION_Y = "0.0";
	/**
	 * 当前切换的城市
	 */
	public static String CITY = "北京";
	/**
	 * 定位的城市
	 */
	public static String LOCATION_CITY = "";
	/**
	 * 定位成功但是反解析失败
	 */
	public static boolean IS_LOCATION_GEOCODE_FAILED = false;
	/**
	 * 地图x坐标 经度
	 */
	public static String[] mapX = { "0.0", "0.0", "0.0", "0.0", "0.0", "0.0",
			"0.0", "0.0", "0.0", "0.0", "0.0" };
	/**
	 * 地图y坐标 纬度
	 */
	// public static String[] mapY = {"0.0","0.0","0.0","0.0"};
	public static String[] mapY = { "0.0", "0.0", "0.0", "0.0", "0.0", "0.0",
			"0.0", "0.0", "0.0", "0.0", "0.0" };

	/**
	 * 
	 */
	public static String[] mapMoreX = { "0.0", "0.0", "0.0", "0.0", "0.0",
			"0.0", "0.0" };

	/**
	 * 
	 */
	public static String[] mapMoreY = { "0.0", "0.0", "0.0", "0.0", "0.0",
			"0.0", "0.0" };

	public static enum houseType {
	}

	public static int screenWidth = 0;
	public static int screenHeight = 0;
	public static boolean chatFunctionSWitcher = true;// true则可以发送图片视频，false不可以关闭多媒体聊天功能
	public static boolean hasSDcard = true;// 是否存在SD卡，默认存在
	public static boolean isStartStatio = false;// 是否启动直播看房true表示已经启动，false为没有启动
	public static Object chatObj = new Object();
}

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
 * Company: soufun
 * </p>
 * 
 * @author    mwq
 * @date       2012-4-1
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

	/**
	 * 最新关注列表
	 */
	// public static ArrayList<AttentionInfo> attentionInfos = new
	// ArrayList<AttentionInfo>();

	/**
	 * 搜房卡账户的id
	 */
	public static String cid = "";

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
	 * 地图x坐标 经度 0、新房；1、二手房；2、租房；3、楼盘社区 4、房屋合租 5、商铺出售 6、别墅出售7、别墅出租 8、写字楼出租
	 * 9、写字楼出售 10、商铺出租
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
	 * 搜索更多x坐标经度 0、房屋合租；1、别墅出售；2、别墅出租；3、写字楼出售；4、写字楼出租；5、商铺出售；6、商铺出租
	 */
	public static String[] mapMoreX = { "0.0", "0.0", "0.0", "0.0", "0.0",
			"0.0", "0.0" };

	/**
	 * 搜索更多y坐标纬度
	 */
	public static String[] mapMoreY = { "0.0", "0.0", "0.0", "0.0", "0.0",
			"0.0", "0.0" };

	public static enum houseType {
		新房, 新盘, 小区, 租房, 二手房, 别墅出租, 别墅出售, 商铺出租, 商铺出售, 写字楼出租, 写字楼出售, 房屋合租, 房屋求购, 房屋求租;
	}

	public static int screenWidth = 0;
	public static int screenHeight = 0;
	public static boolean chatFunctionSWitcher = true;// true则可以发送图片视频，false不可以关闭多媒体聊天功能
	public static boolean hasSDcard = true;// 是否存在SD卡，默认存在
	public static boolean isStartStatio = false;// 是否启动直播看房true表示已经启动，false为没有启动
	public static Object chatObj = new Object();
}

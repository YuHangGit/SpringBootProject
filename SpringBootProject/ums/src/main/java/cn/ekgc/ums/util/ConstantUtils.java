package cn.ekgc.ums.util;

import java.util.Properties;

public class ConstantUtils {
	private static Properties props = new Properties();

	static {
		try {
			props.load(ConstantUtils.class.getClassLoader().getResourceAsStream("props/ums.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * <b>分页信息，默认页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));
	/**
	 * <b>分页信息，默认每页显示条数</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));
}

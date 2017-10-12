package util;

import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String 的工具类
 * 
 * @author Administrator
 *
 */
public class StringUtil {
	/**
	 * 一个String的工具类
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isempty(String str) {
		if (str == null || "".equals(str.trim())) {
			return true;
		}
		return false;
	}

	/**
	 * 正则匹配 验证是否是邮件格式
	 * 
	 * @param email
	 * @return
	 */
	public static boolean isEmail(String email) {
		try {
			String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
			Pattern pattern = Pattern.compile(check);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * @author joe
	 *         Java在执行静态方法时，会在内存中拷贝一份，如果静态方法所在的类里面没有静态的变量，那么线程访问就是安全的，比如在javaee中服务器必然会多线程的处理请求此时如果设计全局需要调用的静态方法，可用此种设计。
	 * @return
	 */
	public static String getUuid() {
		UUID uuid = UUID.randomUUID();
		String temp = uuid.toString();
		return temp.replaceAll("-", "");
	}

	public static String getRandomString(int length) {
		char[] array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		Random random = new Random(System.currentTimeMillis());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int num = random.nextInt(array.length);
			sb.append(array[num]);
		}
		return sb.toString();
	}

	/**
	 * 判断电话号码的格式是否正确
	 * 
	 * @param mobiles
	 * @return
	 */
	public static boolean isMobileNO(String mobiles) {
		Pattern p = Pattern.compile("^((17[0-9])|(13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(mobiles);
		return m.matches();
	}
}

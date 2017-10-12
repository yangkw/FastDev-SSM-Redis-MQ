package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 一个时间的 格式工具类
 * 
 * @author joe蒋渊
 *
 */

public class DateUtil {
	public static String dateToStr(Date date, String parten) {
		SimpleDateFormat sdf = new SimpleDateFormat(parten);
		return sdf.format(date);
	}

	public static void main(String[] args) {

		System.out.println(dateToStr(new Date(), "yyyy年MM月dd日  HH点mm分SS秒"));

	}
}

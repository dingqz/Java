import java.util.*;
import java.text.*;

public class TestDataFormat
{
	public static void main(String[] args) throws Exception
	{
		/*
			DateFormat的构造器是protected的 但它提供了一些静态方法来获取DateFormat实例。
			df = new DateFormat();
			getDateInstance － 格式化后的字符串只有日期。
			getTimeInstance － 格式化的字符串只有时间
			getDateTimeInstance － 格式化的的字符串有日期、时间

		*/
		Date d = new Date();
		System.out.println(d);
		//为了程序更加友好的界面，要求把Date转换成一个符合Locale的字符串。

		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.getDefault()); 
		System.out.println(df.format(d));

		String dateStr = "2007年2月20日 星期二 上午11时54分15秒 CST";
		System.out.println(df.parse(dateStr));

	}
}

//Wed Sep 28 21:14:10 CST 2016
//2016年9月28日 星期三 下午09时14分10秒 CST
//Tue Feb 20 11:54:15 CST 2007
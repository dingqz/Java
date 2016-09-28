import java.util.*;
import java.text.*;

public class TestSimpleDateFormat
{
	public static void main(String[] args) throws Exception
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM的三岁的发送到dd日 HH时mm分ss秒"); 
		System.out.println(sdf.format(new Date()));

		String dateStr = "吞吞吐吐2007%12%03";
		//下面创建转换用的SimpleDateFormat时，需要转换字符串使用占位符替换，不需要转换的就照写
		SimpleDateFormat sdf2 = new SimpleDateFormat("吞吞吐吐yyyy%MM%dd");
		System.out.println(sdf2.parse(dateStr));

	}
}


//2016年09的三岁的发送到28日 21时15分33秒
//Mon Dec 03 00:00:00 CST 2007

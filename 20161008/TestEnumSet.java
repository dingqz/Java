import java.util.*;

enum Season {
	SPRING, SUMMER, FALL, WINTER
}

public class TestEnumSet {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		// 复制Collection集合中所有元素来创建EnumSet集合
		EnumSet enumSet = EnumSet.copyOf(c);
		// 输出[SPRING,FALL]
		System.out.println(enumSet);
		c.add("Struts2权威指南");
		c.add("轻量级J2EE企业应用实战");
		// 下面代码出现异常：因为c集合里的元素不是全部都为枚举值
		enumSet = EnumSet.copyOf(c);
	}
}

//[SPRING, FALL]
//Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Enum
//	at java.util.RegularEnumSet.add(RegularEnumSet.java:18)
//	at java.util.EnumSet.copyOf(EnumSet.java:154)
//	at TestEnumSet.main(TestEnumSet.java:20)
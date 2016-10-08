import java.util.*;

public class TestUnmodifiable
{
       public static void main(String[] args)
      {
             //创建一个空的、不可改变的List对象
             List unmodifiableList = Collections.emptyList();
             //创建一个只有一个元素，且不可改变的Set对象
             Set unmodifiableSet = Collections.singleton("Struts2权威指南" );
             //创建一个普通Map对象
             Map scores = new HashMap();
             scores.put("语文" , 80) ;
             scores.put("Java" , 82);
             //返回普通Map对象对应的不可变版本
             Map unmodifiableMap = Collections.unmodifiableMap(scores) ;
             //下面任意一行代码都将引发UnsupportedOperationException异常
             unmodifiableList.add("测试元素") ;
             unmodifiableSet.add("测试元素") ;
             unmodifiableMap.put("语文" , 90) ;
      }
}

//Exception in thread "main" java.lang.UnsupportedOperationException
//at java.util.AbstractList.add(AbstractList.java:131)
//at java.util.AbstractList.add(AbstractList.java:91)
//at TestUnmodifiable.main(TestUnmodifiable.java:18)

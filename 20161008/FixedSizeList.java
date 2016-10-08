import java.util.*;

public class FixedSizeList
{
       public static void main(String[] args)
      {
             List fixedList = Arrays.asList("Struts2权威指南" , "ROR敏捷开发最佳实践");
             //获取fixedList的实现类，将输出Arrays$ArrayList
            System. out.println(fixedList.getClass());
             //遍历fixedList的集合元素
             for (int i = 0; i < fixedList.size() ; i++)
            {
                  System. out.println(fixedList.get(i));
            }
             //试图增加、删除元素都将引发UnsupportedOperationException异常
             fixedList.add("ROR敏捷开发最佳实践");
            fixedList.remove( "Struts2权威指南" );
      }
}

//class java.util.Arrays$ArrayList
//Struts2权威指南
//ROR敏捷开发最佳实践
//Exception in thread "main" java.lang.UnsupportedOperationException
//	at java.util.AbstractList.add(AbstractList.java:131)
//	at java.util.AbstractList.add(AbstractList.java:91)
//	at FixedSizeList.main(FixedSizeList.java:16)

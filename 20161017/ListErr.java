import java.util.*;

public class ListErr
{
       public static void main(String[] args)
      {
             //创建一个只想保存字符串的List集合
             List strList = new ArrayList();
             strList.add("Struts2权威指南");
             strList.add("基于J2EE的Ajax宝典");
             strList.add("轻量级J2EE企业应用实战");
             //"不小心"把一个Integer对象"丢进"了集合
             strList.add(5);
             for (int i = 0; i < strList.size() ; i++ )
            {
                   //因为List里取出的全部是Object，所以必须强制类型转换
                   //最后一个元素将出现ClassCastException异常
                  String str = (String)strList.get(i);
                  System.out.println(str);
            }
      }
}

//Struts2权威指南
//基于J2EE的Ajax宝典
//Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//	at ListErr.main(ListErr.java:18)
//轻量级J2EE企业应用实战

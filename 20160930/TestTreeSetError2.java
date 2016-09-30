import java.util.*;

public class TestTreeSetError2
{
       public static void main(String[] args)
      {
             TreeSet ts = new TreeSet();
             //向TreeSet集合中添加两个Err对象
             ts.add(new String("Struts权威指南"));
             ts.add(new Date());
      }
}


//Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.util.Date
//at java.util.Date.compareTo(Date.java:112)
//at java.util.TreeMap.put(TreeMap.java:545)
//at java.util.TreeSet.add(TreeSet.java:238)
//at TestTreeSetError2.main(TestTreeSetError2.java:10)
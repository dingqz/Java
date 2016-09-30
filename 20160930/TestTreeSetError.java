import java.util.*;

class Err
{
}
public class TestTreeSetError
{
       public static void main(String[] args)
      {
             TreeSet ts = new TreeSet();
             //向TreeSet集合中添加两个Err对象
             ts.add(new Err());
             ts.add(new Err());
      }
}

//Exception in thread "main" java.lang.ClassCastException: Err cannot be cast to java.lang.Comparable
//      at java.util.TreeMap.put( TreeMap.java:542)
//      at java.util.TreeSet.add( TreeSet.java:238)
//      at TestTreeSetError.main( TestTreeSetError.java:13)
//

import java.util.*;

class R
{
       int count ;
       public R(int count)
      {
             this.count = count;
      }
       public String toString()
      {
             return "R(count属性:" + count + ")";
      }
       public boolean equals(Object obj)
      {
             if (obj instanceof R)
            {
                  R r = (R)obj;
                   if (r.count == this. count)
                  {
                         return true ;
                  }
            }
             return false ;
      }
       public int hashCode()
      {
             return this .count ;
      }
}
public class TestHashSet2
{
       public static void main(String[] args)
      {
             HashSet hs = new HashSet();
             hs.add(new R(5));
             hs.add(new R(-3));
             hs.add(new R(9));
             hs.add(new R(-2));
             //打印TreeSet集合，集合元素是有序排列的
            System. out.println(hs);
             //取出第一个元素
             Iterator it = hs.iterator();
            R first = (R)it.next();
             //为第一个元素的count属性赋值
            first. count = -3;
             //再次输出count将看到TreeSet里的元素处于无序状态
            System. out.println(hs);
            hs.remove( new R(-3));
            System. out.println(hs);
             //输出false
            System. out.println("hs是否包含count为-3的R对象？" + hs.contains(new R(-3)));
             //输出false
            System. out.println("hs是否包含count为5的R对象？" + hs.contains(new R(5)));

      }
}



//[R(count属性:5), R(count属性:9), R(count属性:-3), R(count属性:-2)]
//[R(count属性:-3), R(count属性:9), R(count属性:-3), R(count属性:-2)]
//[R(count属性:-3), R(count属性:9), R(count属性:-2)]
//hs是否包含count为-3的R对象？false
//hs是否包含count为5的R对象？false

import java.util.*;

class A
{
       int count ;
       public A(int count)
      {
             this.count = count;
      }
       public boolean equals (Object obj)
      {
             if (obj == this)
            {
                   return true ;
            }
             if (obj != null &&
                  obj.getClass() == A. class)
            {
                  A a = (A)obj;
                   if (this .count == a.count)
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
class B
{
       public boolean equals(Object obj)
      {
             return true ;
      }
}
public class TestHashtable
{
       public static void main(String[] args)
      {
             Hashtable ht = new Hashtable();
             ht.put(new A(60000) , "Struts2权威指南");
             ht.put(new A(87563) , "轻量级J2EE企业应用实战" );
             ht.put(new A(1232) , new B()) ;
            System. out.println(ht);
             //只要两个对象通过equals比较返回true， Hashtable就认为它们是相等的value。
             //因为Hashtable中有一个B对象，它与任何对象通过equals比较都相等，所以下面输出true。
            System. out.println(ht.containsValue("测试字符串" ));
             //只要两个A对象的count属性相等，它们通过equals比较返回true，且hashCode相等
             //Hashtable 即认为它们是相同的key，所以下面输出true。
            System. out.println(ht.containsKey(new A(87563)));
             //下面语句可以删除最后一个key-value对
            ht.remove( new A(1232));
             for (Object key : ht.keySet())
            {
                  System. out.print(key + "---->" );
                  System. out.print(ht.get(key) + "\n" );
            }
      }
}



//{A@ea60=Struts2权威指南, A@1560b=轻量级J2EE企业应用实战, A@4d0=B@6e1408}
//true
//true
//A@ea60---->Struts2权威指南
//A@1560b---->轻量级J2EE企业应用实战

import java.util.*;

public class TestIdentityHashMap
{
       public static void main(String[] args)
      {
             IdentityHashMap ihm = new IdentityHashMap();
             //下面两行代码将会向IdentityHashMap对象中添加2个key-value对
             ihm.put(new String("语文") , 89);
             ihm.put(new String("语文") , 78);
             ihm.put("java" , 93);
             ihm.put("java" , 98);
            System. out.println(ihm);
      }
}


//{语文=89, 语文=78, java=98}

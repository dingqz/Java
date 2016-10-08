import java.util.*;


public class TestLinkedHashMap
{
       public static void main(String[] args)
      {
             LinkedHashMap scores = new LinkedHashMap();
             scores.put("语文" , 80) ;
             scores.put("数学" , 76) ;
             scores.put("英文" , 76) ;
             //遍历scores里的所有的key-value对
             for (Object key : scores.keySet())
            {
                  System. out.print(key + "------>" );
                  System. out.print(scores.get(key) + "\n" );
            }
      }
}


//语文------>80
//数学------>76
//英文------>76

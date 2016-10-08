import java.util.*;

enum Season
{
       SPRING,SUMMER ,FALL,WINTER
}
public class TestEnumMap
{
       public static void main(String[] args)
      {
             //创建一个EnumMap对象，该EnumMap的所有key必须是Season枚举类的枚举值
             EnumMap enumMap = new EnumMap(Season. class);
             enumMap.put(Season.SUMMER , "夏日炎炎");
             enumMap.put(Season.SPRING , "春暖花开");

            System. out.println(enumMap);
      }
}



//{SPRING=春暖花开, SUMMER=夏日炎炎}
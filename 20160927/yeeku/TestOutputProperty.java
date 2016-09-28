package yeeku;

public class TestOutputProperty
{
       public static void main(String[] args)
      {
             //访问另一个包中的Output接口的MAX_CACHE_LINE属性
            System. out.println(lee.Output.MAX_CACHE_LINE);
             //下面语句将引起"为final变量赋值"的编译异常：
             //lee.Output.MAX_CACHE_LINE = 20;
      }
}


//50

public class TestSeason
{
       public TestSeason(Season s)
      {
            System. out.println(s.getName() + "，这真是一个" + s.getDesc() + "的季节" );
      }
       public static void main(String[] args)
      {
             //直接使用Season的FALL常量代表一个Season对象
             new TestSeason(Season. FALL);
      }
}



//秋天，这真是一个秋高气爽的季节

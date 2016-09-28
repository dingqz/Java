public class TestContinue
{
       public static void main(String[] args)
      {
             //一个简单的for循环
             for (int i = 0; i < 3 ; i++ )
            {
                  System. out.println("i的值是" + i);
                   if (i == 1)
                  {
                         continue;
                  }
                  System. out.println("continue后的输出语句" );
            }
      }
}

//i的值是0
//continue后的输出语句
//i的值是1
//i的值是2
//continue后的输出语句

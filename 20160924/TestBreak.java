public class TestBreak
{
       public static void main(String[] args)
      {
             //一个简单的for循环
             for (int i = 0; i < 10 ; i++ )
            {
                  System. out.println("i的值是" + i);
                   if (i == 2)
                  {
                         break;
                  }
            }
      }
}

//i的值是0
//i的值是1
//i的值是2

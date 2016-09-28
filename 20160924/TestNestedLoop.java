public class TestNestedLoop
{
       public static void main(String[] args)
      {
             //外层循环
             for (int i = 0 ; i < 5 ; i++ )
            {
                   //内层循环
                   for (int j = 0; j < 3 ; j++ )
                  {
                        System. out.println("i的值为:" + i + "  j的值为:" + j);
                  }
            }
      }
}


//i的值为:0  j的值为:0
//i的值为:0  j的值为:1
//i的值为:0  j的值为:2
//i的值为:1  j的值为:0
//i的值为:1  j的值为:1
//i的值为:1  j的值为:2
//i的值为:2  j的值为:0
//i的值为:2  j的值为:1
//i的值为:2  j的值为:2
//i的值为:3  j的值为:0
//i的值为:3  j的值为:1
//i的值为:3  j的值为:2
//i的值为:4  j的值为:0
//i的值为:4  j的值为:1
//i的值为:4  j的值为:2

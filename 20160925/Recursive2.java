public class Recursive2
{
       public static int fn( int n)
      {
             if (n == 20)
            {
                   return 1;
            }
             else if (n == 21)
            {
                   return 4;
            }
             else
            {
                   //方法中调用它自身，就是方法递归
                   return fn(n+2)-2* fn(n+1);
            }
      }

       public static void main(String[] args)
      {
             //输出 fn(10)的结果
            System. out .println(fn(10));
      }
}

//-3771


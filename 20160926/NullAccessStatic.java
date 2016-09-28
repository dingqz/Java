public class NullAccessStatic
{
       private static void test()
      {
            System. out.println("静态方法" );
      }
       public static void main(String[] args)
      {
             //定义一个NullAccessStatic变量，其值为null
            NullAccessStatic nas = null;
             //null对象调用所属类的静态方法
             nas.test();
      }
}

//静态方法

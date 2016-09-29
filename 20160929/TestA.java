interface A
{
       void test();
}
public class TestA
{
       public static void main(String[] args)
      {
            final int age = 0;
            A a = new A()
            {
                   public void test()
                  {
                         //匿名内部类内访问局部变量必须使用final修饰
                        System. out.println(age);
                  }
            };
            a.test();
      }
}


//0

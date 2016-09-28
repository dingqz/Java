public class TestStaticInnerClass
{
       private int prop1 = 5;
       private static int prop2 = 9;
       static class StaticInnerClass
      {
             private static int age;
             public void accessOuterProp()
            {
                   //下面代码出现错误：静态内部类无法访问外部类的实例成员
                  System. out.println(prop1);
                   //下面代码正常
                  System. out.println(prop2);
            }
      }
}
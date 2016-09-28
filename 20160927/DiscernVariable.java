public class DiscernVariable
{
       private String prop = "外部类属性";
       private class InClass
      {
             private String prop = "内部类属性";
             public void info()
            {
                  String prop = "局部变量" ;
                   //通过 外部类类名.this.varName 访问外部类实例属性
                  System. out .println("外部类的属性值：" + DiscernVariable.this .prop );
                   //通过 this.varName 访问外内部类实例的属性
                  System. out .println("内部类的属性值：" + this. prop );
                   //直接访问局部变量
                  System. out .println("局部变量的属性值：" + prop);
            }
      }
       public void test()
      {
             InClass in = new InClass ();
            in.info();
      }
       public static void main(String[] args)
      {
             new DiscernVariable().test();
      }
}


//外部类的属性值：外部类属性
//内部类的属性值：内部类属性
//局部变量的属性值：局部变量

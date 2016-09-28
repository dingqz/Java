class Base
{
       public Base()
      {
            test();
      }
       public void test()
      {
            System. out.println("将被子类重写的方法" );
      }
}
class Sub extends Base
{
       private String name ;
       public void test()
      {
            System. out.println("子类重写父类的方法，其name字符串长度" + name.length());
      }
       public static void main(String[] args)
      {
             //下面代码会引发空指针异常
            Sub s = new Sub();
      }
}

//Exception in thread "main" java.lang.NullPointerException
//at Sub.test(Sub.java:17)
//at Base.<init>(Sub.java:5)
//at Sub.<init>(Sub.java:12)
//at Sub.main(Sub.java:22)

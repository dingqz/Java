public class TestFinalize
{
       private static TestFinalize tf = null;
       public void info()
      {
            System. out.println("测试资源清理的finalize方法" );
      }
       
       
       public static void main(String[] args) throws Exception
      {
             //创建TestFinalize对象立即进入去活状态
             new TestFinalize();
             //通知系统进行资源回收
            System. gc();
            System. runFinalization();
             //Thread.sleep(2000);
             tf.info();
      }
       public void finalize()
      {
             //让tf 引用到试图回收的去活对象，即去活对象重新变成激活
             tf = this ;
      }
       
}
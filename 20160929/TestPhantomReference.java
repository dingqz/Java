import java.lang.ref.*;

public class TestPhantomReference
{
       public static void main(String[] args) throws Exception
      {
             //创建一个字符串对象
            String str = new String("Struts2权威指南" );
             //创建一个引用队列
             ReferenceQueue rq = new ReferenceQueue();
             //创建一个虚引用，让此虚引用引用到"Struts2权威指南"字符串
             PhantomReference  pr = new PhantomReference (str , rq);
             //切断 str引用和"Struts2权威指南"字符串之间的引用
            str = null ;
             //取出虚引用所引用的对象，并不能通过虚引用访问被引用的对象，所以此处输出null
            System. out .println(pr.get());
             //强制垃圾回收
            System. gc();
            System. runFinalization();
             //取出引用队列中最先进入队列中引用与 pr进行比较
            System. out .println(rq.poll() == pr);
      }
}

//null
//true

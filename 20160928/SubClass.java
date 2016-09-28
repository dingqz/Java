class Out
{
       //定义一个非静态内部类，不使用访问控制符，即同一个包中其他类可访问该内部类
       class In
      {
             public In(String msg)
            {
                  System. out.println(msg);
            }
      }
}
public class SubClass extends Out.In
{
       //显示定义SubClass的构造器
       public SubClass(Out out)
      {
             //通过传入的Out对象显式调用In的构造器
            out. super("hello" );
      }
       public static void main(String[] args) {
		new SubClass(new Out());
	}
}


//hello

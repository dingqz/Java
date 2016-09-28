class Person
{
       private String name ;
       public Person(String name)
      {
             this.name = name;
      }
       public void info()
      {
            System. out.println("此人名为：" + name);
      }
}
public class PrintObject
{
       public static void main(String[] args)
      {
             //创建一个Person对象，将之赋给给p变量
            Person p = new Person("孙悟空" );
             //打印p所引用的Person对象
            System. out.println(p);
            System. out.println(p.hashCode());

            String pStr = p + "";
            System. out.println(pStr);
      }
}

//
//Person@c3c749
//12830537
//Person@c3c749
public class TestPerson
{
       public static void main(String[] args)
      {
             //定义一个Person类型的变量
            Person p;
             //通过new关键字调用Person类的构造器，返回一个Person实例，将该Person实例赋给p变量。
            p = new Person();
             //调用p的name属性，直接为该属性赋值。
            p. name = "李刚" ;
             //调用p的say方法，声明say方法时定义了一个形参，
             //调用该方法必须为形参指定一个值
            p.say( "Java语言很简单，学习很容易！" );
             //直接输出p的name属性值，将输出李刚
            System. out.println(p.name );
             //将p变量的值赋值给p2变量
            Person p2 = p;
      }
}

//Java语言很简单，学习很容易！
//李刚

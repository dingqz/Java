public class Varargs
{
       //定义了形参个数可变的方法
       public static void test(int a , String... books)
      {
             //books被当成数组处理
             for (String tmp : books)
            {
                  System. out.println(tmp);
            }
             //输出整数变量a的值
            System. out.println(a);
      }



       public static void main(String[] args)
      {
             //调用test方法，为 args参数可以传入多个的字符串
             test(5 , "Struts2权威指南" , "基于J2EE的Ajax宝典" );
             //调用test方法，为 args参数可以传入多个的字符串
             test(23 , new String[]{ "Ruby On Rails敏捷开发最佳实践" , "轻量级企业应用实战"});

      }
}



//Struts2权威指南
//基于J2EE的Ajax宝典
//5
//Ruby On Rails敏捷开发最佳实践
//轻量级企业应用实战
//23

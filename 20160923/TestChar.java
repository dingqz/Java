public class TestChar
{
       public static void main(String[] args)
      {
             //直接指定单个字符作为字符常量
             char aChar = 'a';
             //使用转义字符来作为字符常量
             char enterChar = '\r';
             //使用Unicode编码值来指定字符常量
             char ch = '\u9999' ;
             //将输出一个'香'字符
            System. out.println(ch);
             //定义一个'中'字符常量
             char zhong = '中' ;
             //直接将一个char变量当成 int类型变量使用
             int zhongValue = zhong;
            System. out.println(zhongValue);
             //直接把一个0～65535范围内的 int整数赋给一个char变量
             char c = 97;
            System. out.println(c);
      }
}


//香
//20013
//a

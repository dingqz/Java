public class TestPrimitiveTransfer
{
       public static void swap(int a , int b)
      {
             //下面三行代码实现a、b变量的值交换。
             //定义一个临时变量来保存a变量的值
             int tmp = a;
             //把b的值赋给a
            a = b;
             //把临时变量tmp的值赋给a
            b = tmp;
            System. out.println("swap方法里，a的值是" + a + "；b的值是" + b);
      }
       public static void main(String[] args)
      {
             int a = 6;
             int b = 9;
             swap(a , b);
            System. out.println("交换结束后，实参a的值是" + a + "；实参b的值是" + b);
      }
}

//swap方法里，a的值是9；b的值是6
//交换结束后，实参a的值是6；实参b的值是9

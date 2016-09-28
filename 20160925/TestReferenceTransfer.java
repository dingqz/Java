public class TestReferenceTransfer
{
       public static void swap(DataWrap dw)
      {
             //下面三行代码实现 dw的a、b属性值交换。
             //定义一个临时变量来保存 dw对象的a属性的值
             int tmp = dw.a ;
             //把dw 对象的b属性值赋给a属性
            dw. a = dw. b;
             //把临时变量tmp的值赋给dw 对象的a属性
            dw. b = tmp;
            System. out.println("swap方法里，a属性的值是" + dw.a + "；b的值是" + dw. b);
             //把dw 直接赋为null，让它不再指向任何有效地址。
            dw = null;
      }
       public static void main(String[] args)
      {
            DataWrap dw = new DataWrap();
            dw. a = 6;
            dw. b = 9;
             swap(dw);
            System. out.println("交换结束后，a属性的值是" + dw.a + "；b属性的值是" + dw.b );

      }
}


//swap方法里，a属性的值是9；b的值是6
//交换结束后，a属性的值是9；b属性的值是6

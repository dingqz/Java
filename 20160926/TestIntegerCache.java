public class TestIntegerCache
{
       public static void main(String[] args)
      {
             //生成新的Integer对象
            Integer in1 = new Integer(6);
             //生成新的Integer对象，并缓存该对象
            Integer in2 = Integer. valueOf(6);
             //直接从缓存中取出 Ineger对象
            Integer in3 = Integer. valueOf(6);
             //输出false
            System. out.println(in1 == in2);
             //输出true
            System. out.println(in2 == in3);
      }
}


//false
//true

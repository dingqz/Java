public class Primitive2String
{
       public static void main(String[] args)
      {
            String intStr = "123";
             //把一个特定字符串转换成 int变量
             int it = Integer.parseInt(intStr);
            System. out.println(it);
            String floatStr = "4.56";
             //把一个特定字符串转换成float变量
             float ft = Float.parseFloat(floatStr);
            System. out.println(ft);
             //把一个float变量转换成String变量
            String ftStr = String. valueOf(2.345f);
            System. out.println(ftStr);
             //把一个double变量转换成String变量
            String dbStr = String.valueOf(3.344);
            System. out.println(dbStr);
             //把一个boolean变量转换成String变量
            String boolStr = String. valueOf(true);
            System. out.println(boolStr.toUpperCase());
      }
}


//123
//4.56
//2.345
//3.344
//TRUE

public enum Operation
{
       PLUS, MINUS , TIMES, DIVIDE;
       //为枚举类定义一个方法，用于实现不同的运算
       public double eval(double x, double y)
      {
             switch(this )
            {
                   case PLUS :   return x + y;
                   case MINUS :  return x - y;
                   case TIMES :  return x * y;
                   case DIVIDE : return x / y;
                   default: return 0;
            }
      }
       public static void main(String[] args)
      {
            System. out.println(Operation.PLUS.eval(3, 4));
            System. out.println(Operation.MINUS.eval(5, 4));
            System. out.println(Operation.TIMES.eval(5, 4));
            System. out.println(Operation.DIVIDE.eval(5, 4));
      }
}

//7.0
//1.0
//20.0
//1.25

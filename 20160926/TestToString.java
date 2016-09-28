class Apple
{
       private String color ;
       private double weight ;
       public Apple(){   }
       //提供有参数的构造器
       public Apple(String color , double weight)
      {
             this.color = color;
             this.weight = weight;
      }

       public void setColor (String color)
      {
             this.color = color;
      }
       public String getColor()
      {
             return this .color ;
      }

       public void setWeight(double weight)
      {
             this.weight = weight;
      }
       public double getWeight()
      {
             return this .weight ;
      }
       public String toString()
      {           
             //return "一个苹果，颜色是：" + color + "，重量是：" + weight;
             return "Apple[color=" + color + ",weight=" + weight + "]" ;
      }
}
public class TestToString
{
       public static void main(String[] args)
      {
            Apple a = new Apple("红色" , 5.68);
            System. out.println(a);
      }
}



//Apple[color=红色,weight=5.68]

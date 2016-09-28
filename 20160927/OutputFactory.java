import lee.Output;

public class OutputFactory
{
       public Output getOutput()
      {
             //下面两行代码用于控制系统到底使用Output的哪个实现类。
             //return new Printer();
             return new BetterPrinter();
      }
       public static void main(String[] args)
      {
            OutputFactory of = new OutputFactory();
            Computer c = new Computer(of.getOutput());
            c.keyIn( "轻量级J2EE企业应用实战" );
            c.keyIn( "Struts2权威指南" );
            c.print();
      }
}


//高速打印机正在打印：轻量级J2EE企业应用实战
//高速打印机正在打印：Struts2权威指南
